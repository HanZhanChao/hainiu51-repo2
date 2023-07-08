package com.hainiu.thread7;

import java.util.LinkedList;

/**
 * @author HaiNiu
 * @description 生产者线程：负责生产产品
 */
public class ProducerThread implements Runnable {
    private LinkedList<String> list;

    // 接收队列，生产者线程生产产品放入该队列
    public ProducerThread(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 生产者线程负责不断的生产
        while (true) {
            // 同步
            synchronized (list) {
                // 如果有产品，那么生产者线程等待
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 没有产品，生产者线程执行
                String product = "XXX";
                list.add(product);
                System.out.println(Thread.currentThread().getName() + "生产者生产了一个" + product + "，目前剩余产品数量：" + list.size());
                // 唤醒等待的消费者 去消费
                list.notifyAll();
            }
        }
    }
}
