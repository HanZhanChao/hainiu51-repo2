package com.hainiu;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author HaiNiu
 * @description 反射获取成员变量并使用
 */
public class Demo05_Field {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // 获取Class对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");

        // 获取构造器
        Student stu = clazz.getDeclaredConstructor().newInstance();

        // 获取成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========");

        Field field = clazz.getDeclaredField("address");
        field.setAccessible(true);

        // 赋值  获取值
        Object o = field.get(stu); // 获取stu对象的成员变量field的值
        System.out.println(o);

        field.set(stu, "shanghai"); // 给stu对象的field成员变量赋值，赋值为shanghai

        System.out.println(field.get(stu));
    }
}
