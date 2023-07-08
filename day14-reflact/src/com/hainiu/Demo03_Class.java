package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03_Class {
    public static void main(String[] args) throws ClassNotFoundException {

        // 针对源码时期 -- 造成类加载
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");
        System.out.println(clazz);

        // 编译成Class文件  数据类型.class 属性
        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);


        // 运行时 已经有对象
        Student s = new Student();
        Class<Student> clazz3 = (Class<Student>) s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz == clazz2);
        System.out.println(clazz == clazz3);

    }
}
