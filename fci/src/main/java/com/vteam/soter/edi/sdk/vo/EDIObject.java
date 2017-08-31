package com.vteam.soter.edi.sdk.vo;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/24.
 */
public class EDIObject {
    protected static Object getValue(Object bean, String filed) throws Exception {
        String geter = "get" + filed;
        Class<?> clz = bean.getClass();
        Method method = clz.getMethod(geter);
        return method.invoke(bean);
    }

    protected static void setValue(Object bean, String filed, Object value) throws Exception {
        String setter = "set" + filed;
        Class<?> clz = bean.getClass();
        if (value instanceof String) {
            Method method = clz.getMethod(setter, String.class);
            method.invoke(bean, value);
        } else {
            Method method = clz.getMethod(setter, value.getClass());
            method.invoke(bean, value);
        }

    }

    protected static void addValue(Object bean, String filed, Object value) throws Exception {
        String add = "add" + filed;
        Class<?> clz = bean.getClass();
        Method method = clz.getMethod(add, value.getClass());
        method.invoke(bean, value);
    }

    protected static String encode(String value) {
        return value.replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll("&", "&amp;")
                .replaceAll("'", "&apos;")
                .replaceAll("\"", "&quot;");
    }

    protected static String decode(String value) {
        return value.replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&amp;", "&")
                .replaceAll("&apos;", "'")
                .replaceAll("&quot;", "\"");
    }
}
