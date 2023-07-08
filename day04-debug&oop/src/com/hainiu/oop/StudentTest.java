package com.hainiu.oop;

/**
 * @author HaiNiu
 * @description 使用学生类
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        // 类名 对象名 = new 类名();
        Student s1 = new Student();
        System.out.println(s1); // com.hainiu.oop.Student@1b6d3586

        // 访问对象的成员变量  给成员变量赋值  获取成员变量的值
        System.out.println(s1.name); // null
        System.out.println(s1.age); // 0
        s1.name = "Tom";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        // 访问对象的成员方法
        s1.study();
        s1.eat("Jerry");
        System.out.println("-----------");
        // 再创建一个
        Student s2 = new Student();
        System.out.println(s2);
        s2.name = "Jack";
        s2.age = 25;
        System.out.println(s2.name);
        System.out.println(s2.age);
        s2.eat("Rose");

        System.out.println("-----------");
        // 两个引用指向同一个对象
        Student s3 = s2;
        s3.age = 28;
        System.out.println(s3.age); // 28
        System.out.println(s2.age); // 28
    }
}
