package com.isprint.jslx.lccfd.service.TimerTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author HYL
 * @create 2017-08-19 下午10:14
 **/
//@Service
public class ReportService {
    @Scheduled(fixedDelay = 1000)
    @Async
    public void test(){
        System.out.println(Thread.currentThread().getName()+":每一秒打印这句话");
    }
    @Scheduled(fixedDelay = 2000)
    @Async
    public void test2(){
        System.out.println(Thread.currentThread().getName()+":每两秒打印这句话");
    }
}
