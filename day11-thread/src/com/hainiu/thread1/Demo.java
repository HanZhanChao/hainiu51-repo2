package com.hainiu.thread1;

/**
 * @author HaiNiu
 * @description
 *
 * main方法在主线程执行，我们在主线程上开启一条新的线程；新线程的优先级采用跟主线程想同的优先级。
 *
 * 线程可以通过构造方法传递名称（默认名称是Thread-0..1...2）
 *
 */
public class Demo {

    public static void main(String[] args) {
        // 创建线程类对象，并启动
        MyThread thread1 = new MyThread("小强");
        thread1.setName("阿强");

        // 再开启一条
        MyThread thread2 = new MyThread("小美");
        thread2.setName("阿珍");

       /* System.out.println(thread1.getPriority()); // 默认优先级 5
        System.out.println(thread2.getPriority());*/

        thread1.setPriority(1);
        thread2.setPriority(10);


        thread1.start(); // start方法启动线程  开启线程并自动调用run方法
        thread2.start();

        // 两条线程争夺资源 随机执行。

       /* for (int i = 0; i < 100; i++) {
            System.out.println("main" + i);
        }
        */
    }

}
