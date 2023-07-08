package com.hainiu.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author HaiNiu
 * @description
 * HashSet
 *  保证的元素唯一
 *  如何存储
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        // 创建集合对象
        HashSet<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");
        set.add("mysql");

        // 遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("========");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
