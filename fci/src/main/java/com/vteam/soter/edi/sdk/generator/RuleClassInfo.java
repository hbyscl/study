package com.vteam.soter.edi.sdk.generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/21.
 */
public class RuleClassInfo {

    private String className;
    private Set<FieldInfo> fieldInfoList = new LinkedHashSet<>();
    private Set<InnerRuleClassInfo> innerClassList = new LinkedHashSet<>();

    public RuleClassInfo(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void putField(FieldInfo fieldInfo){
        this.fieldInfoList.add(fieldInfo);
    }

    public void putInnerClass(InnerRuleClassInfo classInfo){
        this.innerClassList.add(classInfo);
    }

    public String toJavaCode(){
        StringBuilder sb = new StringBuilder();
        if (this instanceof InnerRuleClassInfo) {
            sb.append("public static class ");
        } else {
            sb.append("package com.vteam.soter.edi.sdk.vo;\n\n");
            sb.append("import java.util.*;\n");
            sb.append("import com.vteam.soter.edi.sdk.rule.Rule;\n");
            sb.append("import com.vteam.soter.edi.sdk.rule.STATUS;\n");
            sb.append("public class ");
        }
        sb.append(this.getClassName());
        if(!(this instanceof InnerRuleClassInfo)){
            sb.append(" extends MSG");
        }
        sb.append("{\n");

        for (FieldInfo fieldInfo : fieldInfoList) {
            String fieldName = fieldInfo.getFieldName();
            String fieldType = fieldInfo.getFieldType();
            String rule = fieldInfo.getRule();
            sb.append("    ");
            sb.append(buildRule(rule));
            sb.append("\n");
            if(fieldInfo.isMultiple()){
                sb.append("    private List<");
                sb.append(fieldType);
                sb.append("> ");
                sb.append(fieldName);
                sb.append(";\n");

                sb.append("    public void set");
                sb.append(fieldName);
                sb.append("(List<");
                sb.append(fieldType);
                sb.append("> ");
                sb.append(fieldName);
                sb.append("){\n");
                sb.append("        this.");
                sb.append(fieldName);
                sb.append("=");
                sb.append(fieldName);
                sb.append(";\n");
                sb.append("    }\n");

                sb.append("    public");
                sb.append(" List<");
                sb.append(fieldType);
                sb.append("> get");
                sb.append(fieldName);
                sb.append("(){\n");
                sb.append("        return this.");
                sb.append(fieldName);
                sb.append(";\n");
                sb.append("    }\n");

                sb.append("    public void add");
                sb.append(fieldName);
                sb.append("(");
                sb.append(fieldType);
                sb.append(" ");
                sb.append(fieldName);
                sb.append("){\n");

                sb.append("        if(null == this.");
                sb.append(fieldName);
                sb.append("){\n");
                sb.append("            this.");
                sb.append(fieldName);
                sb.append("= new ArrayList<");
                sb.append(fieldType);
                sb.append(">();\n");
                sb.append("        }\n");

                sb.append("        this.");
                sb.append(fieldName);
                sb.append(".add(");
                sb.append(fieldName);
                sb.append(");\n");

                sb.append("    }\n");
            }
            else{
                sb.append("    private ");
                sb.append(fieldType);
                sb.append(" ");
                sb.append(fieldName);
                sb.append(";\n");

                sb.append("    public void set");
                sb.append(fieldName);
                sb.append("(");
                sb.append(fieldType);
                sb.append(" ");
                sb.append(fieldName);
                sb.append("){\n");
                sb.append("        this.");
                sb.append(fieldName);
                sb.append("=");
                sb.append(fieldName);
                sb.append(";\n");
                sb.append("    }\n");

                sb.append("    public");
                sb.append(" ");
                sb.append(fieldType);
                sb.append(" get");
                sb.append(fieldName);
                sb.append("(){\n");
                sb.append("        return this.");
                sb.append(fieldName);
                sb.append(";\n");
                sb.append("    }\n");
            }
            sb.append("\n");
        }

        for (RuleClassInfo classInfo : innerClassList) {
            sb.append(classInfo.toJavaCode());
        }

        sb.append("}\n\n");
        return sb.toString();
    }

    private String buildRule(String strRule){
        StringBuilder rule = new StringBuilder("@Rule(");

        strRule = strRule.replaceAll("\\[", "").replaceAll("\\]", "").trim();
        //[ status=M; format=N..3; codelist=DocumentType; ]
        String[] strRules = strRule.split(";");
        for (int i = 0; i < strRules.length; i++) {
            String s = strRules[i];
            s = s.trim();
            boolean hasElement = false;
            if(s.equals("no input")){
                rule.append("noInput = true");
                hasElement = true;
            }
            else{
                String[] type = s.split("=");
                String key = type[0].trim();
                String value =type.length > 1 ? type[1].trim() : "";
                if("status".equals(key)){
                    rule.append("status = STATUS.");
                    rule.append(value.substring(0,1));
                    hasElement = true;
                }
                else if("format".equals(key)){
                    rule.append("format = \"");
                    rule.append(value);
                    rule.append("\"");
                    hasElement = true;
                }
                else if("codelist".equals(key)){
                    rule.append("codelist = \"");
                    rule.append(value);
                    rule.append("\"");
                    hasElement = true;
                }
            }

            if(i < strRules.length-1 && hasElement){
                rule.append(",");
            }

        }

        rule.append(")");

        return rule.toString();
    }
}
class FieldInfo{
    private String fieldType;
    private String fieldName;
    private String rule;
    private boolean isMultiple = false;

    public FieldInfo(String fieldType, String fieldName, String rule) {
        this.fieldType = fieldType;
        this.fieldName = fieldName;
        this.rule = rule;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public boolean isMultiple() {
        return isMultiple;
    }

    public void setMultiple(boolean multiple) {
        isMultiple = multiple;
    }
}
class InnerRuleClassInfo extends RuleClassInfo{
    public InnerRuleClassInfo(String className) {
        super(className);
    }
}