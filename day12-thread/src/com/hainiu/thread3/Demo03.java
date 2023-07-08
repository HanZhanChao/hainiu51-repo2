package com.hainiu.thread3;

import java.util.concurrent.Semaphore;

/**
 * @author HaiNiu
 * @description Semaphore 控制访问共享资源的线程数量为2，获得许可证才能
 */
public class Demo03 {
    public static void main(String[] args) {

        // 同时允许2条线程访问共享资源
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    // 获取许可证
                    semaphore.acquire();
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "获取了许可证，可以执行任务了。。。。");

                    Thread.sleep(2000);

                    System.out.println(name + "任务完成，归还许可证");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 归还许可证
                    semaphore.release();
                }
            }).start();
        }

    }
}
