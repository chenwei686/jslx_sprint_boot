package com.isprint.jslx.lccfd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HYL
 * @create 2017-11-09 下午2:07
 **/
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/cdn")
    public String cdn2() {
        return "/index";
    }
}
