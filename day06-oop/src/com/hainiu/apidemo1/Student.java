package com.hainiu.apidemo1;

import java.util.Objects;

/**
 * @author HaiNiu
 * @description
 */
public class Student {

    private String name;
    private int age;

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

    // 重写之后 比较的是具体的属性值 只有两个对象所有的属性都相同 才会返回true
    /*@Override
    public boolean equals(Object o) { // this  o
        // 引用相同 -- 相等
        if (this == o) return true;

        // this能调用方法 说明this != null 如果o == null 不相等
        // 获取Class对象 不想同 说明两个对象是不同类的对象，不想等
        if (o == null || getClass() != o.getClass()) return false;

        // 向下转型
        Student student = (Student) o;
        //
        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    // 默认根据地址值计算出来 重写之后根据属性进行计算
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }*/

    // 方便查看对象
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
