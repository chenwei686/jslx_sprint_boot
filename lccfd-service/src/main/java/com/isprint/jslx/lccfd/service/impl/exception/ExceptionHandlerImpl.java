package com.isprint.jslx.lccfd.service.impl.exception;

import com.isprint.jslx.springboot.exceptionhandler.ExceptionHandler;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理的实现类
 *
 * @author HYL
 * @create 2017-11-08 上午11:42
 **/
@Service
public class ExceptionHandlerImpl implements ExceptionHandler {
    private Logger logger=Logger.getLogger(ExceptionHandlerImpl.class);
    @Override
    public void handlerException(Exception e, HttpServletRequest request) {
        logger.error("逻辑异常",e);
    }
}
