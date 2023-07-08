package com.hainiu.oop10;

/**
 * @author HaiNiu
 * @description
 * 懒汉式单例
 *  有线程安全问题（多线程）
 */
public class LazySingleton {

    // 私有构造
    private LazySingleton(){}

    // 只声明不创建
    private static LazySingleton instance = null;

    // 对外提供
    public static LazySingleton getInstance() {
        // 判断有没有
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
