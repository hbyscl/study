package com.vteam.study.commonstext;

import org.apache.commons.text.StrBuilder;
import org.apache.commons.text.StrSubstitutor;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author li.cheng
 * @version 1.0.0 2017年03月14日
 * @since soter 1.0.0
 */
public class PraiseText {
    public static void main(String[] args) throws DocumentException {
//        Map<String,String> a = new HashMap<>();
//        a.put("a","111");
//        a.put("b","222");
//        String c = "^^^${a}^^^${b}^^^${c}";
//        String s = StrSubstitutor.replace(c, a);
//        System.out.println("s = " + s);
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("");
        Element rootElement = document.getRootElement();
        rootElement.elements();
    }
}
