package com.hainiu.annodemo2;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author HaiNiu
 * @description 对TestMethod注解的解释类
 */
public class TestMethodParse {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取类的字节码对象
        Class<Demo> clazz = (Class<Demo>) Class.forName("com.hainiu.annodemo2.Demo");

        // 获取构造方法创建对象
        Demo demo = clazz.getDeclaredConstructor().newInstance();

        // 获取Demo类中的所有方法
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            // 标记了注解的才执行
            if (method.isAnnotationPresent(TestMethod.class)) {
                // 获取这个注解的元素
                TestMethod tm = method.getAnnotation(TestMethod.class);
                if ("run".equals(tm.value())) {
                    method.invoke(demo);
                }
            }
        }

    }
}
