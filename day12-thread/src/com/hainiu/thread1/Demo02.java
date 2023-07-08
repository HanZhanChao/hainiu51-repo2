package com.hainiu.thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) {

        // 创建固定数量线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            // 提交任务
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "线程执行");
            });
        }

        // 线程池销毁
        executorService.shutdown();

    }

}
