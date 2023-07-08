package com.hainiu;

import java.lang.reflect.Method;

/**
 * @author HaiNiu
 * @description
 */
public class Demo06_Method {
    public static void main(String[] args) throws Exception {

        // 获取Class对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");

        // 获取构造器
        Student stu = clazz.getDeclaredConstructor().newInstance();

        // 获取成员方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("===========");

        Method m1 = clazz.getMethod("toString");
        // 执行
        Object o = m1.invoke(stu);
        System.out.println(o);

        Method m2 = clazz.getMethod("setName", String.class);
        m2.setAccessible(true);
        Object obj = m2.invoke(stu, "Jack");
        System.out.println(stu);
        System.out.println(obj);

    }
}
