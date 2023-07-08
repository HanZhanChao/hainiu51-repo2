package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description 描述人的信息
 *
 * javabean -- 描述事物信息的类 不是一个app
 *
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
