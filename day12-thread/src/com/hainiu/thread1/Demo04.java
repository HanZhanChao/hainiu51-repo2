package com.hainiu.thread1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author HaiNiu
 * @description
 * public ThreadPoolExecutor(int corePoolSize,						// 核心线程数量
 *                           int maximumPoolSize,					// 最大线程数量
 *                           long keepAliveTime,					// 空闲线程存活时间（值）
 *                           TimeUnit unit,						    // 空闲线程存活时间（单位）
 *                           BlockingQueue<Runnable> workQueue,	    // 阻塞队列
 *                           ThreadFactory threadFactory,			// 新线程的创建工厂（产生方式）
 *                           RejectedExecutionHandler handler)		// 拒绝策略
 *
 *
 *  1、核心线程数量
 *  2、最大线程数量
 *  3、空闲线程存活时间（值）
 *  4、空闲线程存活时间（单位）
 *  5、阻塞队列
 *  6、新线程的创建工厂（产生方式）
 *  7、拒绝策略
 *      AbortPolicy -- 拒绝新任务并抛出异常
 *      CallerRunsPolicy -- 绕过线程池，调用run方法
 *      DiscardOldestPolicy -- 抛弃等待时间最长的任务
 *      DiscardPolicy -- 静默的拒绝任务(不建议)
 */
public class Demo04 {

    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,
                10,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//               new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardPolicy()
                );


        for (int i = 0; i < 16; i++) {
            int x = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "执行" + x);
            });
        }


    }

}
