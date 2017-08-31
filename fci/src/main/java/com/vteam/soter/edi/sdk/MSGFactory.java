package com.vteam.soter.edi.sdk;

import com.vteam.soter.edi.sdk.exception.EDIParseException;
import com.vteam.soter.edi.sdk.generator.BuildMsg;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.STATUS;
import com.vteam.soter.edi.sdk.vo.EDIObject;
import com.vteam.soter.edi.sdk.vo.MSG;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.List;

import static org.dom4j.DocumentHelper.*;

/**
 * EDI报文处理工具
 * Created by li.cheng on 2017/7/21.
 */
public class MSGFactory extends EDIObject {

    /**
     * 将报文实体对象转换为EDI标准的XML字符串
     *
     * @param msg 报文实体
     * @return XML
     * @throws EDIParseException
     */
    public static String buildXML(MSG msg) throws EDIParseException {
        String check = msg.check();
        if ("".equals(check)) {
            try {
                Document doc = createDocument();
                obj2xml(msg, doc);
                OutputFormat print = OutputFormat.createPrettyPrint();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                XMLWriter writer = new XMLWriter(out, print);
                writer.write(doc);
                writer.close();
                out.flush();
                out.close();
                return new String(out.toByteArray(), "utf-8").
                        replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n", "").
                        replaceAll(" xmlns=\"\"", "");
            } catch (UnsupportedEncodingException e) {
                throw new EDIParseException("Unsupported encoding utf-8");
            } catch (IOException e) {
                throw new EDIParseException("生成XML字符出错", e);
            }
        }
        throw new EDIParseException(check);
    }

    /**
     * 根据标准的EDI报文XML创建报文实体对象
     *
     * @param msg 报文实体类
     * @param xml 报文字符串
     * @param <T> MSG01~MSG74
     * @return 报文实体对象
     * @throws EDIParseException
     */
    public static <T extends MSG> T buildMSG(Class<T> msg, String xml) throws EDIParseException {
        return buildMSG(msg,xml,true);
    }

    public static <T extends MSG> T buildMSGDoNotCheck(Class<T> msg, String xml) throws EDIParseException {
        return buildMSG(msg,xml,false);
    }

    /**
     * 通过EDI提供的标准带规则定义的XML文件,生成Java代码
     * @param xmlFile   <p>带有规则定义的原始XML文件
     *                  [ status=M; format=N..3; codelist=DisputeReason;]</p>
     * @param voPath    Java实体路径
     * @throws EDIParseException
     */
    public static void buildJavaVo(File xmlFile, String voPath) throws EDIParseException {
        BuildMsg buildMsg = new BuildMsg();
        buildMsg.writeToJavaFile(xmlFile, voPath);
    }

    private static <T extends MSG> T buildMSG(Class<T> msg, String xml,boolean hasCheck) throws EDIParseException {
        try {
            T obj = msg.newInstance();
            Document doc = DocumentHelper.parseText(xml);
            Element rootElement = doc.getRootElement();
            if (!rootElement.getName().equals(msg.getSimpleName())) {
                throw new EDIParseException("XML与实体对象不匹配");
            }
            xml2obj(obj, rootElement);
            if(hasCheck){
                String check = obj.check();
                if ("".equals(check)) {
                    return obj;
                }
                throw new EDIParseException(check);
            }
            return obj;
        } catch (IllegalAccessException e) {
            throw new EDIParseException("Illegal access : " + msg, e);
        } catch (InstantiationException e) {
            throw new EDIParseException("创建" + msg + "对象出错", e);
        } catch (DocumentException e) {
            throw new EDIParseException("XML解析出错", e);
        }
    }

    private static void obj2xml(Object msg, Branch element) throws EDIParseException {
        Class clz = msg.getClass();
        String msgName = clz.getSimpleName();
        Field[] fields = clz.getDeclaredFields();

        Element el = element instanceof Document ?
                DocumentFactory.getInstance().createElement(msgName, "urn:schemas-edifactoring-com:" + msgName) :
                createElement(msgName);

        try {
            for (Field field : fields) {
                String name = field.getName();
                Rule rule = field.getAnnotation(Rule.class);

                Object value = getValue(msg, name);
                boolean noInput = rule.noInput();
                STATUS status = rule.status();

                if (null == value || "".equals(value.toString())) {
                    if (noInput) {
                        continue;
                    } else if (status.equals(STATUS.M)) {
                        throw new EDIParseException(name + ":不能为空");
                    }
                }

                Class<?> type = field.getType();
                if (type.isAssignableFrom(List.class)) {
                    if (null == value) {
                        continue;
                    }
                    List listObj = (List) value;
                    for (Object o : listObj) {
                        obj2xml(o, el);
                    }
                } else if (type.getName().equals("java.lang.String")) {
                    Element strEl = createElement(name);
                    strEl.add(createText(null == value ? "" : encode(value.toString())));
                    el.add(strEl);
                } else {
                    obj2xml(value, el);
                }


            }
        } catch (EDIParseException e) {
            throw e;
        } catch (Exception e) {
            throw new EDIParseException(e);
        }
        element.add(el);
    }

    private static Object xml2obj(Object obj, Element el) throws EDIParseException {
        try {
            Class<?> clz = obj.getClass();
            Field[] fields = clz.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                Class<?> type = field.getType();
                if (type.isAssignableFrom(List.class)) {
                    List<Element> elements = el.elements(name);

                    for (Element element : elements) {

                        addValue(obj, name, xml2obj(getInnerInstance(clz, name), element));
                    }
                } else if (type.getName().equals("java.lang.String")) {
                    Element strElement = el.element(name);
                    if (null != strElement) {
                        setValue(obj, name, decode(strElement.getTextTrim()));
                    }
                } else {
                    setValue(obj, name, xml2obj(type.newInstance(), el.element(name)));
                }
            }
        } catch (EDIParseException e) {
            throw e;
        } catch (Exception e) {
            throw new EDIParseException(e);
        }
        return obj;
    }

    private static Object getInnerInstance(Class clz, String innerClassName) throws Exception {
        Class innerClazz[] = clz.getDeclaredClasses();
        for (Class cls : innerClazz) {
            if (cls.getName().endsWith("$" + innerClassName)) {
                return cls.newInstance();
            }
        }
        return null;
    }
}
