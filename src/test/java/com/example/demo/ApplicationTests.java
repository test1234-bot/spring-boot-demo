package com.example.demo;

import com.example.demo.domain.QueueTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.Queue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    QueueTask queueTask;

    @Test
    public void contextLoads() {

        LinkedList<String> queue = new LinkedList();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("你好");

        System.out.println("queueTask" + queueTask);
        queueTask.setQueue(queue);
    }

}
