package com.vteam.soter.edi.sdk.vo;

import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.EdiRuleHelper;
import com.vteam.soter.edi.sdk.rule.STATUS;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 所有EDI报文标准定义
 */
public abstract class MSG extends EDIObject {

    /**
     * 检查报文中各个字段内容是否满足EDI规则定义
     * CodeList只检查业务方已经提供的几种,其它未定义的CodeList只作字符规则检查
     * [ status=M; format=N..3; codelist=DisputeReason;]
     * @return 检查失败原因
     */
    public String check() {
        return doCheck(this, "");
    }

    private String doCheck(Object obj, String err) {
        if (!"".equals(err)) {
            return err;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                String name = field.getName();
                Rule rule = field.getAnnotation(Rule.class);
                if (null == rule) {
                    return "属性：" + name + "未找到规则定义";
                }
                Object value = getValue(obj, name);
                STATUS status = rule.status();

                if (null == value || "".equals(value)) {
                    if (status.equals(STATUS.M)) {
                        return "属性：" + name + "不能为空";
                    }
                    return "";
                }

                Class<?> type = field.getType();
                if (type.isAssignableFrom(List.class)) {
                    List listObj = (List) getValue(obj, name);
                    for (Object o : listObj) {
                        String loopErr = doCheck(o, "");
                        if (!"".equals(loopErr)) {
                            return loopErr;
                        }
                    }
                } else if (type.getName().equals("java.lang.String")) {
                    String format = rule.format();
                    if (!EdiRuleHelper.checkFormat(value.toString(), format)) {
                        return "属性：" + name + "与格式" + format + "不匹配";
                    }
                } else {
                    String objErr = doCheck(value, "");
                    if (!"".equals(objErr)) {
                        return objErr;
                    }
                }

                String codelist = rule.codelist();
                if(!"".equals(codelist)){
                    if (!EdiRuleHelper.checkCodeList(this.getClass(),codelist,value.toString())) {
                        return "属性：" + name +"的codelist "+codelist+"="+value+",与"+this.getClass().getSimpleName()+"中定义的不匹配";
                    }
                }

            }
        } catch (Exception e) {
            return "error:" + e;
        }
        return "";
    }




}
