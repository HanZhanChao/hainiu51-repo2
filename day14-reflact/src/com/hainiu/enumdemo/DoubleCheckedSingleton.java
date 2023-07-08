package com.hainiu.enumdemo;

public class DoubleCheckedSingleton {
    // 定义实例但是不直接初始化，volatile禁止重排序操作，避免空指针异常
    private static volatile DoubleCheckedSingleton instance = null;

    // 私有构造函数不允许外部new
    private DoubleCheckedSingleton() {
    }

    // 对外提供的方法用来获取单例对象
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }
}