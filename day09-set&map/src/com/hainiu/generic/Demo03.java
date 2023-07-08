package com.hainiu.generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {
        // 调用方法时明确
        show("hello");
        show(100);
        show(true);

        System.out.println("---------");

        // Collection
        // public abstract <T> T[] toArray(T[] a); -- 将集合转为指定类型的数组
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "hello", "world", "world");

        // 转字符串数组
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // 把泛型单独定义在方法上 -- 在返回值的前面声明
    public static <T> void show(T t) {
        System.out.println(t);
    }

}
