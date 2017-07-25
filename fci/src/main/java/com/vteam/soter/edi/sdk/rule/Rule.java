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
    String codelist() default "";
    boolean noInput() default false;
}
