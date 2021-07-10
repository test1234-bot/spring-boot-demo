package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Data
@Component
public class QueueTask {


    @Setter
    @Getter
    private String string;

    @Setter
    @Getter
    private Queue<String> queue;

    public QueueTask() {
    }

    public QueueTask(String string) {
        this.string = string;
    }

    public QueueTask(Queue queue) {
        this.queue = queue;
    }
}
