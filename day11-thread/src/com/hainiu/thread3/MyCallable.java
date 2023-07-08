package com.hainiu.thread3;

import java.util.concurrent.Callable;

/**
 * @author HaiNiu
 * @description
 */
public class MyCallable implements Callable<Integer> {

    // 实现的任务
    @Override
    public Integer call() throws Exception {
        // 求1-100的数据和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println("正在累加：" + i);
            sum += i;
        }
        return sum;
    }
}
