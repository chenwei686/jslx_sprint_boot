package com.isprint.jslx.lccfd.controller;

import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HYL
 * @create 2017-08-19 下午5:40
 **/
@RestController
class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public BaseTimuSearch test1(String id) {
        BaseTimuSearch baseTimuSearch = testService.findById(id);
        return baseTimuSearch;

    }

}
