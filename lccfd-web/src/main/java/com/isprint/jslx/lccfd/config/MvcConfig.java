package com.isprint.jslx.lccfd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author HYL
 * @create 2017-08-19 下午6:00
 **/
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 页面跳转的控制
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/toLogin").setViewName("login");
    }


}
