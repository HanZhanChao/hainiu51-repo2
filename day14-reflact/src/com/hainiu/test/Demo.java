package com.hainiu.test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 *
 *
 */
public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*
        // 工人
        Worker w = new Worker();
        w.work();

        // 教师
        Teacher t = new Teacher();
        t.teach();
        */

        // 利用类加载器 加载系统资源  obj.properties在资源文件夹根路径
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");

        Properties properties = new Properties();
        // 从流中加载
        properties.load(in);

        // 获取类的名称 方法的名称
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 利用反射技术 创建类的对象 调用类的方法
        Class<?> clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getMethod(methodName);

        // 执行
        method.invoke(obj);

    }
}
