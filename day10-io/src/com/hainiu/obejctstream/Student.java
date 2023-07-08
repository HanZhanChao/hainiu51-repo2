package com.hainiu.obejctstream;

import java.io.Serializable;

/**
 * @author HaiNiu
 * @description
 *
 * 该类对象要想被序列化操作，必须实现Serializable
 */
public class Student implements Serializable {

    // 需要提供一个固定的序列化版本号 防止反序列化失败 -- 到字符串源码拷贝
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // 瞬态 关键字
    private transient double money; // 薪资  不想参与序列化过程

//    private String id;

    public Student() {
    }

    public Student(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
