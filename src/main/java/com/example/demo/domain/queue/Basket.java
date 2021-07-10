package com.example.demo.domain.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Basket {
    BlockingQueue<String> basket=new ArrayBlockingQueue<String>(10);

    public void produce() throws InterruptedException {
        basket.put("an apple");
    }

    public void cousume() throws InterruptedException {
        basket.take();
    }

    public int getBasketNum(){
       return basket.size();
    }
}
