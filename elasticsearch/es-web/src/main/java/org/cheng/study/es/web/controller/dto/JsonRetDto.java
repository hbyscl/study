package org.cheng.study.es.web.controller.dto;

/**
 * Created by chengli on 2014/12/26.
 */
public class JsonRetDto {
    private int code = 0;
    private String msg = "";
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
