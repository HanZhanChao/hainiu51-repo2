package com.hainiu.thread2;


/**
 * @author HaiNiu
 * @description
 */
public class MyRunnable implements Runnable {

    // 将要执行的任务 实现
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " hello world! " + i);

            // 插队线程
            /*
            if ("Tom".equals(Thread.currentThread().getName()) && i == 10) {
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            */

            // 礼让线程
            /*if (i == 10) {
                Thread.yield();
            }*/

           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
