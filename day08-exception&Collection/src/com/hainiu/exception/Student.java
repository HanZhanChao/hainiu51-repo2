package com.hainiu.exception;

/**
 * @author HaiNiu
 * @description 定义学生类 对学生的年龄做限定
 */
public class Student {

    private String name;
    private int age;

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
        // 判断年龄
        if (age >= 18 && age <= 35) {
            this.age = age;
        } else {
            // 非法的数据 -- 抛出一个异常对象
            throw new AgeOutOfBoundsException("the age must be between 18 and 35");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
