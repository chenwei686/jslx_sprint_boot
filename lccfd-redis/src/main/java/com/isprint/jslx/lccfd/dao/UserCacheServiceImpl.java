package com.isprint.jslx.lccfd.dao;

import com.alibaba.fastjson.JSON;
import com.isprint.jslx.lccfd.utils.RedisService;
import com.isprint.jslx.springboot.loginInterceptor.UserCacheService;
import com.isprint.jslx.springboot.loginInterceptor.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

/**
 * 用户缓存的实现类
 *
 * @author HYL
 * @create 2017-11-07 下午8:13
 **/
@Repository
public class UserCacheServiceImpl implements UserCacheService {

    @Autowired
    private RedisService redisService;

    @Override
    public User getUserBySessionId(String sessionId) {
        Jedis jedis = redisService.getResource(0);
        String userStr = jedis.get(sessionId);
        if (userStr!=null) {
            User user = JSON.parseObject(userStr, User.class);
            return user;
        }
        return null;
    }
}
