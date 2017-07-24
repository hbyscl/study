package com.vteam.soter.edi.sdk.rule;

import java.lang.annotation.*;


/**
 * Created by Administrator on 2017/7/21.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Rule {
    STATUS status();
    String format() default "";
    CODELIST codelist() default CODELIST.SYS_NONE;
    boolean noInput() default false;
}
