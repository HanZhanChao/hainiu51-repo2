package com.hainiu.oop4;

/**
 * @author HaiNiu
 * @description
 */
public class Zi extends Fu {

    int num = 20;

    public void print() {
        System.out.println("Zi。。。print");
    }

    public void test() {
        int num = 30;
        System.out.println(num); // 30
        // 本类的成员变量
        System.out.println(this.num); // 20
        // 父类的成员变量
        System.out.println(super.num); // 10
    }

}
