package com.hainiu.thread7;

import java.util.LinkedList;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {

    public static void main(String[] args) {

        // 创建一个容器  -- 传递给两个线程类 -- 保证它们使用同一个容器
        LinkedList<String> list = new LinkedList<>();

        new Thread(new ProducerThread(list)).start();
        new Thread(new ConsumerThread(list)).start();
    }
}
