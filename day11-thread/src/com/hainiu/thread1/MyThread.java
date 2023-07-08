package com.hainiu.thread1;

/**
 * @author HaiNiu
 * @description 线程类
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    // 重写run方法 -- 定义自己的任务
    @Override
    public void run() {
        // 用循环语句模拟程序执行
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello " + i);
        }
    }
}
