package com.hainiu;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author HaiNiu
 * @description 多线程操作共享数据 作出修改
 */
public class Account implements Runnable {

    private volatile int totalMoney = 5000;

//    private AtomicInteger totalMoney = new AtomicInteger(5000);

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (this) {
                // 取钱
                int money = (random.nextInt(5) + 1) * 100;
                // 判断
                if (totalMoney < money) {
                    break;
                }
                totalMoney -= money;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                totalMoney.addAndGet(-money);
                System.out.println(Thread.currentThread().getName() + "取出" + money + "元，账户剩余：" + totalMoney + "元");
            }
        }
    }
}
