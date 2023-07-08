package com.hainiu.thread5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author HaiNiu
 * @description 模拟多个窗口售出同一个场次的100张票。
 */
public class MyTicket implements Runnable {

    // 票定义在成员变量 -- 为了保证同一个资源
    private int ticket = 100;

    // 互斥锁
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        // 卖票
        while (true) {

            // 加锁
            lock.lock(); // 加锁之后 使用try...finally语句保证锁资源肯定被释放
            try {
                if (ticket <= 0) {
                    break;
                }
                // 售出一张
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                // 模拟一下出票的时间
                try {
                    Thread.sleep(100); // 为了凸显问题
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
            } finally {
                // 释放锁
                lock.unlock();
            }
        }

    }
}
