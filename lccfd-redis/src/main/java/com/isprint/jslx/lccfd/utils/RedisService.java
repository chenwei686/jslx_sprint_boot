package com.isprint.jslx.lccfd.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis的工具类
 *
 * @author HYL
 * @create 2017-08-19 下午9:32
 **/
@Component
public class RedisService {

    @Autowired
    private JedisPool jedisPool;

    public Jedis getResource(Integer dbNum) {
        Jedis resource = jedisPool.getResource();
        resource.select(dbNum);
        return resource;
    }

    public void returnResource(Jedis jedis) {
        if(jedis != null){
            jedisPool.returnResourceObject(jedis);
        }
    }

    public String getObjectFromJedis(String key,Jedis jedis){
        String s = jedis.get(key);
        return s;
    }



}
