package com.vteam.soter.edi.sdk.generator;

import com.vteam.soter.edi.sdk.exception.EDIParseException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/21.
 */
public class BuildMsg {

    public void writeToJavaFile(File xmlFile, String voPath) throws EDIParseException {
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(xmlFile);
            Element rootElement = document.getRootElement();
            String name = rootElement.getName();
            RuleClassInfo classInfo = new RuleClassInfo(name);
            parse(rootElement, classInfo);
            String path = voPath + File.separatorChar + name + ".java";
            String x = classInfo.toJavaCode();
            FileWriter writer = new FileWriter(path);
            writer.write(x);
            writer.flush();
            writer.close();

//            Files.write(Paths.get(path), x.getBytes());
        } catch (DocumentException e) {
            throw new EDIParseException("解析xml文件出错", e);
        } catch (IOException e) {
            throw new EDIParseException("生成Java代码出错", e);
        }
    }

    private void parse(Element el, RuleClassInfo classInfo) {
        List<Element> elements = el.elements();
        String rule = el.getTextTrim();
        String fieldName = el.getName();

        if (elements.isEmpty()) {
            FieldInfo fieldInfo = new FieldInfo("String", fieldName, rule);
            classInfo.putField(fieldInfo);
        } else if (el.getParent() == null) {
            for (Element element : elements) {
                parse(element, classInfo);
            }
        } else {
            FieldInfo fieldInfo = new FieldInfo(fieldName, fieldName, rule);
            if (rule.equals("[ status=M..999; ]")) {
                fieldInfo.setMultiple(true);
            }
            classInfo.putField(fieldInfo);

            InnerRuleClassInfo innerClass = new InnerRuleClassInfo(fieldName);
            classInfo.putInnerClass(innerClass);
            for (Element element : elements) {
                parse(element, innerClass);
            }
        }
    }

}
