package com.hainiu.thread3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        FutureTask实现了Runnable接口，可以作为Thread类的构造方法参数
​		FutureTask中的get方法能够获取线程执行完毕的结果
         */

        // 实现 线程任务对象
        MyCallable callable = new MyCallable();

        // 接收任务执行结果
        FutureTask<Integer> futureTask1 = new FutureTask<>(callable);
        // 接收任务执行结果
        FutureTask<Integer> futureTask2 = new FutureTask<>(callable);

        Thread t1 = new Thread(futureTask1);

        Thread t2 = new Thread(futureTask2);


        t1.start();
        t2.start();

        // 获取结果都方法 一定要在启动线程后调用
        Integer result1 = futureTask1.get(); // 阻塞式 -- 等待线程执行完毕 才能得到结果
        System.out.println("线程1：" + result1);

        // 获取结果都方法 一定要在启动线程后调用
        Integer result2 = futureTask2.get();
        System.out.println("线程2：" + result2);

    }
}
