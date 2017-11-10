package com.isprint.jslx.springboot.exceptionhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 需要区分的是,如果是app则返回json,如果是网页处理,则返回的是一个页面
 *
 * @author HYL
 * @create 2017-11-08 上午10:01
 **/

@ControllerAdvice
@ConfigurationProperties(prefix = "cdn" )
//@PropertySource(value = "classpath:config/redis-config.properties",encoding = "UTF-8")
public class GlobalExceptionHandler {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Autowired
    private com.isprint.jslx.springboot.exceptionhandler.ExceptionHandler exceptionHandler;

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErroHandler(HttpServletRequest request, Exception e) {
        Boolean isApp = true;
        String deviceId = request.getParameter("deviceId");
        if (deviceId == null) {
            isApp = false;
        }
        exceptionHandler.handlerException(e,request);
        if (isApp) {
            ModelAndView modelAndView = new ModelAndView("forward:/appException");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("forward:/webException");
            return modelAndView;
        }
    }
    @ModelAttribute
    public void innitStaticAttributes(Model model){
        model.addAttribute("resource",url);
    }

}
