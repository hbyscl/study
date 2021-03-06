package com.vteam.study.api;

import org.springframework.stereotype.Component;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月15日
 * @since soter 1.0.0
 */
@Component
public class DftEmpService implements EmpService {
    @Override
    public String getUser() {
        return "dft emp";
    }

    @Override
    public Object buildToken(String userName) {
        return "emp token:"+userName;
    }
}
