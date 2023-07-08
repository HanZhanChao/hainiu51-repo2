package com.hainiu.oop5;

/**
 * @author HaiNiu
 * @description
 */
public class Zi extends Fu {

    public Zi() {
//        super();
//        this(10);
        System.out.println("子类空参构造执行");
    }

    public Zi(int x) {
        super(x);
        System.out.println("子类带参构造执行");
    }
}
