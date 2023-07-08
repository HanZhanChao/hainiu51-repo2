package com.hainiu.thread2;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account();

        // 一条线程检测余额
        new Thread(() -> {
            while (true) {
                if (account.getMoney() == 0) {
                    System.out.println("aaa");
                    System.out.println("bbb");
                    System.out.println("没钱了~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
            }
        }).start();


        Thread.sleep(1000);

        // 一条线程取钱
        new Thread(() -> {
            while (true) {
                account.get(100);
            }
        }).start();

    }
}
