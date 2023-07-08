package com.hainiu.thread8;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author HaiNiu
 * @description
 */
public class ConsumerThread implements Runnable {

    private ArrayBlockingQueue<String> queue;

    public ConsumerThread(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = queue.take();
                System.out.println("消费者消费了一个" + s + "，目前队列中剩余：" + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
