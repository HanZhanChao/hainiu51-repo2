package com.hainiu.thread8;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        /*
        // 有界阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);

        // 存 -- 队列满时，自动等待
        queue.put("aaa");
        queue.put("bbb");
        queue.put("ccc");

        // 取 -- 队列空时，自动等待
        for (int i = 0; i < 4; i++) {
            String s = queue.take();
            System.out.println(s);
        }


        queue.put("ddd");
        */
        // 无界阻塞队列
//        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();


        /*ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        new Thread(new ProducerThread(queue)).start();
        new Thread(new ConsumerThread(queue)).start();*/


        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        new Thread(() -> {
            while (true) {
                try {
                    String product = "可乐";
                    queue.put(product);
                    System.out.println("生产者生产了一个" + product + "，目前队列中剩余：" + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    String s = queue.take();
                    System.out.println("消费者消费了一个" + s + "，目前队列中剩余：" + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
