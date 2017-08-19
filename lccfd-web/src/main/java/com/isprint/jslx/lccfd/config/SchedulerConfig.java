package com.isprint.jslx.lccfd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author HYL
 * @create 2017-08-19 下午7:24
 **/
@Configuration
public class SchedulerConfig implements SchedulingConfigurer {


    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ScheduledExecutorService taskPool = Executors.newScheduledThreadPool(100);//默认线程池的大小是100个
        taskRegistrar.setScheduler(taskPool);
    }
}
