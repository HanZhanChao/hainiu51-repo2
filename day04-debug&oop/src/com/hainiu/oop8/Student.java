package com.hainiu.oop8;

/**
 * @author HaiNiu
 * @description 描述海牛的学生
 */
public class Student {

    // 静态代码块 -- 随着类的加载就执行
    static {
        System.out.println("static code block");
    }


    private String name;
    private int age;

    // 学校
    public static String school;

    public Student() {
    }

    public Student(String name, int age) {
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
