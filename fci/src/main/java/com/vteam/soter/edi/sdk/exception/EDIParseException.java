package com.vteam.soter.edi.sdk.exception;

/**
 * Created by Administrator on 2017/7/24.
 */
public class EDIParseException extends Exception {

    public EDIParseException(Throwable cause) {
        super(cause);
    }

    public EDIParseException(String message) {
        super(message);
    }

    public EDIParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
