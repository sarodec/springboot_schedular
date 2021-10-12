package com.learn.springboot.scheduler;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration
@EnableScheduling
@ConditionalOnProperty(name="scheduling.enabled" , matchIfMissing=false)
class Example2 {
    @Scheduled(fixedRate = 10000)
    void perform() throws InterruptedException{
        System.out.println("This will not wait for previous execution to complete "+ new Date());
//        Thread.sleep(1000L);
    }
}