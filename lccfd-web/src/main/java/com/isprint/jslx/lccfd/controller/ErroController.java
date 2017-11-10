package com.isprint.jslx.lccfd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HYL
 * @create 2017-11-08 上午10:48
 **/
@Controller()
@RequestMapping("advice")
public class ErroController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("发生了异常");
        throw new RuntimeException();
    }
}
