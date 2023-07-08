package com.hainiu;

/**
 * @author HaiNiu
 * @description 类加载器
 */
public class Demo02_ClassLoader {

    public static void main(String[] args) {

        // ClassLoader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader(); // 获取系统类加载器
        System.out.println(systemClassLoader); // AppClassLoader


        ClassLoader classLoader = systemClassLoader.getParent(); // 扩展类加载器
        System.out.println(classLoader); // ExtClassLoader

        ClassLoader loader = classLoader.getParent();
        System.out.println(loader);

    }
}
