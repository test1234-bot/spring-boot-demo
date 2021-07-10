package com.example.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
@EnableScheduling
@Component
public class ScheduleTask2 {

    @Autowired
    QueueTask queueTask;


    public void schedule() {
        Queue<String> queue = new LinkedList();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("你好");

        queueTask.setQueue(queue);
        System.out.println("queueTask" + queueTask);

    }

}
