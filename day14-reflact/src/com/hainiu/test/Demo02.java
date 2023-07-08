package com.hainiu.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description  利用反射技术越过泛型的编译期检查
 *
 * 往泛型为Integer的List集合中 存入一个字符串。
 *      泛型：编译期的安全检测机制 -- 仅在编译期存在 -- 在运行期会进行泛型擦除
 *
 */
public class Demo02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
//        list.add("200");

        // 反射技术获取这个方法
        Class<ArrayList> clazz = (Class<ArrayList>) list.getClass();
        // 获取添加元素的方法时，将参数设置为Object
        Method method = clazz.getMethod("add", Object.class);

        method.invoke(list, "abc");

        // 遍历查看结果
        for (Object x : list) {
            System.out.println(x);
        }

    }
}
