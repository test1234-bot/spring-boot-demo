package com.example.demo.domain.queue.delayQueue;

import java.util.concurrent.TimeUnit;

public class Message {
    private int id;
    private String body;
    private long excuteTime;

    public Message(int id, String body, long delayTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(delayTime,TimeUnit.MILLISECONDS)+System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getExcuteTime() {
        return excuteTime;
    }

    public void setExcuteTime(long excuteTime) {
        this.excuteTime = excuteTime;
    }


    public long getDelayTime(TimeUnit unit){
        return unit.convert(this.excuteTime-System.nanoTime(),TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", excuteTime=" + excuteTime +
                '}';
    }
}
