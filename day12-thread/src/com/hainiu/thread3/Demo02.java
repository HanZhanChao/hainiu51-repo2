package com.hainiu.thread3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author HaiNiu
 * @description CountDownLatch 应用
 */
public class Demo02 {

    public static void main(String[] args) {

        // 首先定义一个计数器
        CountDownLatch count = new CountDownLatch(3);

        // 定义集合存储每条线程的计算结果
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(list);

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                int num = 0;
                for (int j = 1; j <= 100; j++) {
                    num += j;
                    System.out.println(Thread.currentThread().getName() + "正在累加：" + j);
                }
                synchronizedList.add(num);
                // 每当计算完一个结果，让计数器减一
                count.countDown();
            }).start();
        }

        // 统计最终结果的线程: 首先等待，等其他三条线程计算完毕
        new Thread(() -> {
            // 等待
            try {
                count.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            System.out.println(sum);
        }).start();

    }
}
