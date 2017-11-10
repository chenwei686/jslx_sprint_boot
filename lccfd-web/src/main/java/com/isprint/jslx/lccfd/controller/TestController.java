package com.isprint.jslx.lccfd.controller;

import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.service.inter.test.TestService;
import com.isprint.jslx.lccfd.utils.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

/**
 * @author HYL
 * @create 2017-08-19 下午5:40
 **/
@RestController
class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private RedisService redisService;

    @RequestMapping("/test")
    public BaseTimuSearch test1(String id) {
        BaseTimuSearch baseTimuSearch = testService.findById(id);
        String str = "$\\frac{{\\sqrt{3}}}{2}{t^2}+4\\sqrt{3}t$";
        Jedis resource = redisService.getResource(2);
        String objectFromJedis = redisService.getObjectFromJedis(str, resource);
        System.out.println(objectFromJedis);
        return baseTimuSearch;

    }

    @RequestMapping("/appException")
    public String appExceptionHandler() {
        return "app";
    }

    @RequestMapping("/webException")
    public String webExceptionHandler() {

        return "web";
    }

    @RequestMapping("/go")
    public String go() {
        return "go";
    }

}
