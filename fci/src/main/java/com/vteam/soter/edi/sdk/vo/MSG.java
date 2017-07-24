package com.vteam.soter.edi.sdk.vo;

import com.vteam.soter.edi.sdk.MSGFactory;
import com.vteam.soter.edi.sdk.rule.Rule;
import com.vteam.soter.edi.sdk.rule.FCIRuleHelper;
import com.vteam.soter.edi.sdk.rule.STATUS;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/7/21.
 */
public abstract class MSG extends EDIObject {
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
                    if (!FCIRuleHelper.checkFormat(value.toString(), format)) {
                        return "属性：" + name + "与格式" + format + "不匹配";
                    }
                } else {
                    String objErr = doCheck(value, "");
                    if (!"".equals(objErr)) {
                        return objErr;
                    }
                }

//                CODELIST codelist = rule.codelist();
//                if(!CODELIST.SYS_NONE.equals(codelist)){
//                    if (!FCIRuleHelper.checkCodeList(this.getClass(),codelist,value.toString())) {
//                        return "属性：" + name +"的CODELIST:"+codelist+"="+value+",与"+this.getClass().getSimpleName()+"中定义的不匹配";
//                    }
//                }

            }
        } catch (Exception e) {
            return "error:" + e;
        }
        return "";
    }




}
