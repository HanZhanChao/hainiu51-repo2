package com.hainiu.oop;

/**
 * @author HaiNiu
 * @description
 */
public class PhoneTest {
    public static void main(String[] args) {

        Phone p = new Phone();
        System.out.println(p);

        p.brand = "大米";
        // 使用对象直接打点访问属性的方式是不安全的
//        p.price = 100;

        // 通过调用成员方法间接地访问成员变量
        p.setPrice(1999);
        System.out.println(p.getPrice());

        System.out.println(p.brand);
//        System.out.println(p.price);

    }
}
