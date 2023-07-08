package com.hainiu.oop;

/**
 * @author HaiNiu
 * @description 学生类 描述学生的信息（属性和行为）
 * * **属性：在类中通过成员变量来体现（类中方法外的变量）
 * * **行为：在类中通过成员方法来体现（和前面的方法相比去掉static关键字即可）
 */
public class Student {
    // 属性 成员变量  定义在类中（方法外）的变量
    String name; // 声明一个姓名属性
    int age; // 声明一个年龄属性

    // 行为 成员方法
    // 学习
    public void study() {
        System.out.println(name + " good good study day day up");
    }

    public void eat(String n) {
        System.out.println(name + "和" + n + "去吃饭");
    }
}
