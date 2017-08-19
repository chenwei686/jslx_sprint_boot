package com.isprint.jslx.lccfd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HYL
 * @create 2017-08-19 下午5:40
 **/
@RestController
class TestController {

    @RequestMapping("/")
    public String test1() {

        return "hello";

    }

}
