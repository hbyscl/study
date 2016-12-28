package com.vteam.study.service;

import com.vteam.study.an.OsgiService;
import com.vteam.study.an.ReferenceService;
import com.vteam.study.api.EmpService;
import com.vteam.study.api.UserService;
import org.springframework.stereotype.Component;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
@Component
@OsgiService
public class BizService {

    private UserService userService;
    private EmpService empService;

    @ReferenceService
    public void setUserService(UserService userService) {
        System.out.println("BizService.setUserService---" + userService.getClass());
        this.userService = userService;
    }

    @ReferenceService
    public void setEmpService(EmpService empService) {
        System.out.println("BizService.setEmpService---" + empService.getClass());
        this.empService = empService;
    }

    public void buy() {
        System.out.println("userService.getUser() = " + userService.getUser());
    }

    public void hei() {
        System.out.println("empService.getUser() = " + empService.getUser());
    }
}
