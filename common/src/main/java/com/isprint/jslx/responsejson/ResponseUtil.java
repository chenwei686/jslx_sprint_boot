package com.isprint.jslx.responsejson;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response工具类
 *
 * @author HYL
 * @create 2017-11-07 下午9:43
 **/
public class ResponseUtil {
    private static Logger logger=Logger.getLogger(ResponseUtil.class);
    public static void responseOutWithJson(HttpServletResponse response,
                                       JSONObject responseObject) {
        //将实体对象转换为JSON Object转换
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(responseObject.toString());
            logger.info("返回是\n");
            logger.info(responseObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
