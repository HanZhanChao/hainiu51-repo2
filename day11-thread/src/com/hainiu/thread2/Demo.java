package com.hainiu.thread2;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        // 创建Thread类 将MyRunnable作为参数传递给构造器
        Thread t1 = new Thread(runnable, "Tom");
        t1.start();

        // 再开一条
        Thread t2 = new Thread(runnable, "Jerry");


        t2.setDaemon(true); // 设置守护线程 -- 开启前调用

        t2.start();

    }
}
