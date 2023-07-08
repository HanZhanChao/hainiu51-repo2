package com.hainiu.thread6;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {

    public static void main(String[] args) {

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行了");
            }
        }).start();

        new Thread(() -> System.out.println("线程也能执行")).start();*/

        // 定义两个锁对象
        Object lockA = new Object();
        Object lockB = new Object();

        // 开启两条线程
        new Thread(() -> {
            while (true) {
                // 获取A锁
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + "获取到A锁，继续执行任务。。。");
                    // 获取B锁
                    synchronized (lockB) {
                        System.out.println(Thread.currentThread().getName() + "获取到B锁，继续执行任务。。。");
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                // 获取A锁
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + "获取到A锁，继续执行任务。。。");
                    // 获取B锁
                    synchronized (lockB) {
                        System.out.println(Thread.currentThread().getName() + "获取到B锁，继续执行任务。。。");
                    }
                }
            }
        }).start();

    }
}
