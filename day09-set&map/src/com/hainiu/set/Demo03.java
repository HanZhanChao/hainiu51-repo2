package com.hainiu.set;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @author HaiNiu
 * @description
 * TreeSet 存储的数据 唯一，对元素排序
 */
public class Demo03 {
    public static void main(String[] args) {
        /*TreeSet<Integer> set = new TreeSet<>();

        set.add(8);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(8);
        set.add(5);
        set.add(8);

        for (Integer num : set) {
            System.out.println(num);
        }*/

        TreeSet<String> set = new TreeSet<>();

        Collections.addAll(set, "hello", "world", "java", "java", "javaee", "javase", "big");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
