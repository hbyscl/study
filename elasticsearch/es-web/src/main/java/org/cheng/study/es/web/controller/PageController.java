package org.cheng.study.es.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月17日
 * @since soter 1.0.0
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

}
