package com.isprint.jslx.lccfd.config;

import com.isprint.jslx.springboot.loginInterceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author HYL
 * @create 2017-08-19 下午6:00
 **/
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 页面跳转的控制
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/toLogin").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/test/**")
                .excludePathPatterns("/advice/**")
                .excludePathPatterns("/index/**")
                .excludePathPatterns("/appException/**")
                .excludePathPatterns("/webException/**")
                .excludePathPatterns("/error/**")
                .excludePathPatterns("/teacher/**");
    }
}
