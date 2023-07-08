package com.hainiu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author HaiNiu
 * @description 获取类中的构造方法
 */
public class Demo04_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取字节码文件对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");

        // 获取所有公共构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("==============");

        // 获取所有声明的构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("==============");
        // Constructor<T> getConstructor(Class... parameterTypes) 根据参数的Class类型 获取 对应参数的构造器
        // Student(java.lang.String,int,java.lang.String)

        Constructor<Student> c1 = clazz.getConstructor();
        System.out.println(c1);

        Constructor<Student> c2 = clazz.getConstructor(Class.forName("java.lang.String"), int.class, String.class);
        System.out.println(c2);

        Constructor<Student> c3 = clazz.getDeclaredConstructor(String.class);
        System.out.println(c3);

        System.out.println("==============");
        // 创建对象
        // public T newInstance(Object... initargs)

        // 空参构造
        Student s1 = c1.newInstance();
        System.out.println(s1);

        // 公共带参构造
        Student s2 = c2.newInstance("Tom", 20, "beijing");
        System.out.println(s2);

        // 私有
        // 取消访问权限检查
        c3.setAccessible(true); // 暴力反射
        Student s3 = c3.newInstance("Jerry");


        System.out.println(s3);

    }
}
