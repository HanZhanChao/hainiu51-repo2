package com.hainiu.thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author HaiNiu
 * @description
 *
 * 继承Thread
 *
 * 实现Runnable
 *
 * 实现Callable<V>
 *
 *
 * 同步机制
 *      synchronized (锁对象) {
 *
 *      }
 *      互斥
 *
 *      Lock
 *
 *  死锁
 *      互斥
 *      请求和保持
 *      不可掠夺
 *      循环等待
 *
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        /*
        new Thread(() -> {
            System.out.println("线程执行了");
        }).start();
        */

        // 任务频繁的场景下：反复创建线程 销毁线程

        // 获取单线程线程池  得到线程的执行者服务接口
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            int x = i;
            // 提交任务
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "线程执行了" + x);
            });
        }


        // 同时提交两个任务 -- 等待第一个任务结束 线程空闲

        // 线程池销毁
        executorService.shutdown();

    }
}
