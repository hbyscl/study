package com.vteam.study.service;

import com.vteam.study.an.OsgiService;
import com.vteam.study.an.ReferenceService;
import com.vteam.study.api.ComService;
import org.springframework.stereotype.Component;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
@Component
@OsgiService
public class FlowService {

    private ComService comService;

    @ReferenceService
    public void setComService(ComService comService) {
        System.out.println("FlowService.setComService---"+comService.getClass());
        this.comService = comService;
    }

    public void doNextFlow(){
        System.out.println("comService.getCom() = " + comService.getCom());
    }
}
