package com.isprint.jslx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author HYL
 * @create 2017-08-19 下午7:33
 **/
@Component
@ConfigurationProperties(prefix = "wechat")
@PropertySource(value = "classpath:config/wechat.properties",encoding = "UTF-8")
@Configuration
public class WechatConfig {
    private String appid;
    private String appsecret;

    public String getAppid() {
        return appid;
    }

    public String getAppsecret() {
        return appsecret;
    }
}
