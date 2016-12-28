package com.vteam.study.an;

import java.lang.annotation.*;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface OsgiService {
}
