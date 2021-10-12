package com.learn.springboot.scheduler;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration
@EnableScheduling
@ConditionalOnProperty(name="scheduling.enabled" , matchIfMissing=false)
class Example5 {
    @Scheduled(cron="0 1 * * * *")
    void perform() throws InterruptedException{
        System.out.println("Cron Schedule to run after evey minute + "+ new Date());
        Thread.sleep(1000L);
    }
}