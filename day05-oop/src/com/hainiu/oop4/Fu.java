package com.hainiu.oop4;

/**
 * @author HaiNiu
 * @description
 */
public class Fu {
    static {
        System.out.println("Fu 静态代码块");
    }
    {
        System.out.println("Fu 构造代码块");
    }
    public Fu() {
        System.out.println("Fu 构造方法");
    }
}
