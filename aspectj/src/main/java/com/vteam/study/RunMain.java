package com.vteam.study;

import com.vteam.study.api.ComService;
import com.vteam.study.api.UserService;
import com.vteam.study.fw.ApiFactory;
import com.vteam.study.fw.ProxyFramework;
import com.vteam.study.service.BizService;
import com.vteam.study.service.FlowService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
public class RunMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.start();
        System.out.println("RunMain.main.started");
        BizService bizService = context.getBean(BizService.class);
        bizService.buy();
        bizService.hei();
        FlowService flowService = context.getBean(FlowService.class);
        flowService.doNextFlow();
    }
}
