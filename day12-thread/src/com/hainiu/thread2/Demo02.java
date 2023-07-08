package com.hainiu.thread2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author HaiNiu
 * @description 开启10条线程，每条线程将变量自增1万次
 *
 * compare and swap 比较并交换
 *
 *  内存值V  旧的预期值A  要修改的值B
 *
 *
 */
public class Demo02 {

//    private static volatile int num = 0;
    private static AtomicInteger num = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {

        /*AtomicInteger x = new AtomicInteger(10);
//        int y = x.getAndIncrement();
        int y = x.incrementAndGet();
        System.out.println(y);
        System.out.println(x);*/

        // 10条线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
//                    num++;
                    num.incrementAndGet();
                }
            }).start();
        }

        // 让自增先结束
        Thread.sleep(2000);

        System.out.println(num);

    }
}
