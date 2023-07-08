package com.hainiu.oop10;

/**
 * @author HaiNiu
 * @description
 *
 * 单例
 *
 */
public class HungrySingleton {

    // 将构造方法私有  不让别人创建对象
    private HungrySingleton() {}

    // 自己创建一个
    private static HungrySingleton instance = new HungrySingleton();

    // 定义一个方法 向外提供这个唯一的对象
    public static HungrySingleton getInstance() {
        return instance;
    }

    // 一定有其他功能

}
