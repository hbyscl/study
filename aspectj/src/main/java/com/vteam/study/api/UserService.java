package com.vteam.study.api;

/**
 * @author li.cheng
 * @version 1.0.0 2016年12月14日
 * @since soter 1.0.0
 */
public interface UserService {
    String getUser();
    Object buildToken(String userName);
}
