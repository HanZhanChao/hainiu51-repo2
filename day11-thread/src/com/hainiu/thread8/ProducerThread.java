package com.hainiu.thread8;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author HaiNiu
 * @description
 */
public class ProducerThread implements Runnable {

    private ArrayBlockingQueue<String> queue;

    public ProducerThread(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // 生产
        while (true) {
            try {
                String product = "可乐";
                queue.put(product);
                System.out.println("生产者生产了一个" + product + "，目前队列中剩余：" + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
