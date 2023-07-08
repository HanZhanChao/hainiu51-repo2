package com.hainiu.oop4;

/**
 * @author HaiNiu
 * @description
 */
public class Zi extends Fu {
    static {
        System.out.println("Zi 静态代码块");
    }

    {
        System.out.println("Zi 构造代码块");
    }
    public Zi() {
        System.out.println("Zi 构造方法");
    }
}
