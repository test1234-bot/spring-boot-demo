package com.example.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Slf4j
@EnableScheduling
@Component
public class ScheduleTask {

    @Autowired
    QueueTask queueTask;

    @Scheduled(cron = "${scheduled.cron}")
    public void schedule() {
        Queue<String> queue = queueTask.getQueue();
        System.out.println("queueTask====>"+queueTask);
        log.info("queueTask:" + (queue == null ? 0 : queue.size()));
        String str;


        while ((str=queue.poll())!=null){
            log.info("queue.poll()"+str);
        }

        log.info("test");
    }
}
