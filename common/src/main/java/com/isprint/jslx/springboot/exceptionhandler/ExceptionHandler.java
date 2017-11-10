package com.isprint.jslx.springboot.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常的处理
 *
 * @author HYL
 * @create 2017-11-08 上午10:00
 **/
public interface ExceptionHandler {
    public void handlerException(Exception e, HttpServletRequest request);
}
