package com.hainiu.thread2;

/**
 * @author HaiNiu
 * @description 账户类
 */
public class Account {

    private volatile int money = 1000;


    // 取钱
    public void get(int x) {
        money -= x;
        System.out.println("取出" + x + "，剩余" + money);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // 获取
    public int getMoney() {
        return money;
    }
}
