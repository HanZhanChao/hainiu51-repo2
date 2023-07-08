package com.hainiu.thread7;

import java.util.LinkedList;

/**
 * @author HaiNiu
 * @description 消费者线程：负责消费产品
 */
public class ConsumerThread implements Runnable {

    private LinkedList<String> list;

    // 接收队列，消费者线程从该队列中取出产品
    public ConsumerThread(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 消费者线程负责不断的消费
        while (true) {
            // 同步机制 -- 由于消费者和生产者使用的队列是同一个，就使用这个队列作为锁对象
            synchronized (list) {
                if (list.size() == 0) {
                    // 没有产品，消费者等待
                    try {
                        list.wait(); // 注意：必须使用锁对象调用等待和唤醒的方法
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 有产品，消费者线程执行
                String s = list.removeFirst();
                System.out.println(Thread.currentThread().getName() + "消费掉一个" + s + "，目前剩余产品数量：" + list.size());
                // 唤醒等待的生产者线程
                list.notifyAll();
            }
        }
    }
}
