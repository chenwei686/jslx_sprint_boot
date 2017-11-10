package com.isprint.jslx.springboot.loginInterceptor;

import com.alibaba.fastjson.JSONObject;
import com.isprint.jslx.dateutils.DateUtil;
import com.isprint.jslx.responsejson.ResponseUtil;
import com.isprint.jslx.springboot.loginInterceptor.user.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-07 下午5:35
 * 登入的拦截器
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = Logger.getLogger(LoginInterceptor.class);

    @Autowired
    private UserCacheService userCacheService;


    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 在操作之前的拦截器
     * @Date: 下午5:37 2017/11/7
     * @URL:
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o) throws Exception {
        Boolean flag = false;
        boolean isApp = false;
        String contextPath = httpServletRequest.getContextPath();
        httpServletRequest.getSession().setAttribute("contextPath", contextPath);//设置访问的上下文路径
        String sessionId = httpServletRequest.getSession().getId();
        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        String urlStr = requestURL.toString();
        String[] split = urlStr.split("/");
        StringBuilder parameters = new StringBuilder();
        String header = httpServletRequest.getHeader("user-agent");
        logger.info(header);
        for (Map.Entry<String, String[]> stringEntry : parameterMap.entrySet()) {
            isApp = stringEntry.getKey().contains("deviceId");
            if (isApp) {
                isApp = true;
            }
            parameters.append(stringEntry.getKey()).append(":").append(stringEntry.getValue()).append("   ");
        }
        Date date = new Date();
        String time = DateUtil.getNormalDate(date);
        logger.info("=============================================");
        logger.info("time:" + time);
        logger.info("ContextPath:http://" + split[2] + contextPath);
        logger.info("requestURL:" + requestURL);
        logger.info("sessionId:" + sessionId);
        logger.info("parameters:" + parameters.toString());
        logger.info("=============================================");
        User user = userCacheService.getUserBySessionId(sessionId);
        if (user != null) {
            flag = true;
        } else {

            if (!isApp) {
                response.sendRedirect(contextPath + "/index");
            } else {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("result","用户未登入");
                jsonObject.put("status",1);
                ResponseUtil.responseOutWithJson(response,jsonObject);
            }
        }
        return flag;
    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }


    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 在操作之后的拦截器
     * @Date: 下午5:37 2017/11/7
     * @URL:
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("afterCompletion");
    }
}
