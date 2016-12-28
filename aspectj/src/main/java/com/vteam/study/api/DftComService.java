package com.vteam.study.api;

import org.springframework.stereotype.Component;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月15日
 * @since soter 1.0.0
 */
@Component
public class DftComService implements ComService {
    @Override
    public Integer getCom() {
        return 20161215;
    }
}
