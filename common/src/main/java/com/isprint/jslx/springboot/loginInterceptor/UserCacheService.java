package com.isprint.jslx.springboot.loginInterceptor;


import com.isprint.jslx.springboot.loginInterceptor.user.User;

/**
 * @author HYL
 * @create 2017-11-07 下午6:12
 * 用户信息的缓存接口
 **/
public interface UserCacheService {
    public User getUserBySessionId(String sessionId);
}
