package com.hainiu.thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {

        // 创建可缓存的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "线程执行");
            });
        }


    }

}
