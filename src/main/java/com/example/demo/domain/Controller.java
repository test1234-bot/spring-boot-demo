package com.example.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
@ResponseBody
@RestController
@RequestMapping("/queue")
public class Controller {

    @Autowired
    QueueTask queueTask;

    Queue<String> queue = new LinkedList();

    @RequestMapping(value = "/queueTaskAdd", method = RequestMethod.GET)
    public void queueTaskAdd(@RequestParam String param) {
        log.info("执行queueTaskAdd方法...");
        queue.add(param);
        queueTask.setQueue(queue);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testOk() {
        log.info("testOk");
        return "teskOk!";
    }
}
