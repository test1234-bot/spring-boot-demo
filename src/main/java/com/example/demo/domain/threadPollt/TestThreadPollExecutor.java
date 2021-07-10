package com.example.demo.domain.threadPollt;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @title: TestThreadPollExecutor
 * @projectName spring-boot-demo
 * @description: TODO
 * @date 2019/8/2422:30
 */
public class TestThreadPollExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));

        for (int i = 0; i < 15; i++) {
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中的线程的数目:" + executor.getPoolSize() + ";线程池-等待执行的数目:" + executor.getQueue().size() + ";线程池-已执行完成的数目：" + executor.getCompletedTaskCount());

        }
        executor.shutdown();
    }
}

class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行task:" + taskNum);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task:" + taskNum + "执行完毕");
    }
}
