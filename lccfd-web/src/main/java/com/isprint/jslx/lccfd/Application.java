package com.isprint.jslx.lccfd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 *
 * @author HYL
 * @create 2017-08-19 下午5:38
 **/
@SpringBootApplication
@EnableAsync
@EnableScheduling
@ComponentScan("com.isprint.jslx")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }
}
