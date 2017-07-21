package org.cheng.study.fci;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/7/21.
 */
public class BuildMsg {

    public static final String VO_PATH = "E:\\project\\study\\fci\\src\\main\\java\\org\\cheng\\study\\fci\\vo\\";

    private static Set<String> codeList = new HashSet<>();

    public static void main(String[] args) throws Exception {
        File res = new File(BuildMsg.class.getResource("/").toURI());
        Stream.of(res.listFiles(File::isFile)).forEach(file -> writeToJavaFile(file));
        codeList.forEach(System.out::println);
    }

    private static void writeToJavaFile(File file){
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(file);
            Element rootElement = document.getRootElement();
            String name = rootElement.getName();
            RuleClassInfo classInfo = new RuleClassInfo(name);
            parse(rootElement,classInfo);
            String path = VO_PATH+name+".java";
            String x = classInfo.toJavaCode();
            Files.write(Paths.get(path),x.getBytes());
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parse(Element el,RuleClassInfo classInfo) {
        List<Element> elements = el.elements();
        String rule = el.getTextTrim();
        if(rule.contains("codelist=")){
            String[] split = rule.split("codelist=");
            String s = split[1];
            if(s.contains(";")){
                codeList.add(s.split(";")[0]);
            }
            else{
                codeList.add(s.trim());
            }
        }
        String fieldName = el.getName();
        if(elements.isEmpty()){
            FieldInfo fieldInfo = new FieldInfo("String", fieldName, rule);
            classInfo.putField(fieldInfo);
        }
        else if(el.getParent() == null){
            for (Element element : elements) {
                parse(element,classInfo);
            }
        }
        else{
            FieldInfo fieldInfo = new FieldInfo(fieldName, fieldName, rule);
            if(rule.equals("[ status=M..999; ]")){
                fieldInfo.setMultiple(true);
            }
            classInfo.putField(fieldInfo);

            InnerRuleClassInfo innerClass = new InnerRuleClassInfo(fieldName);
            classInfo.putInnerClass(innerClass);
            for (Element element : elements) {
                parse(element,innerClass);
            }
        }
    }

}
