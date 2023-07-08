package com.hainiu.oop6;

/**
 * @author HaiNiu
 * @description
 *
 * JDK8 接口中可以定义 default 修饰的实现的方法
 * JDK8 接口中可以定义 static 修饰的实现的方法
 */
public class Demo {
    public static void main(String[] args) {

        InterImpl ii = new InterImpl();

        ii.test();

        Inter.hello();

    }
}
