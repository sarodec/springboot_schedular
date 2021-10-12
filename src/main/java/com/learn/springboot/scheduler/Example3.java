package com.learn.springboot.scheduler;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration
@EnableScheduling
@ConditionalOnProperty(name="scheduling.enabled" , matchIfMissing=false)
class Example3 {
    @Scheduled(fixedDelay = 1000L, initialDelay = 40000)
    void perform() throws InterruptedException{
        System.out.println("Run After every 1000L + "+ new Date());
        Thread.sleep(1000L);
    }
}