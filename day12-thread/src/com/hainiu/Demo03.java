package com.hainiu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author HaiNiu
 * @description
 * ArrayList<String> list = new ArrayList<>();
 * Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
 */
public class Demo03 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");

        // 定义map集合
        TreeMap<String, Integer> map = new TreeMap<>();

        // 遍历list
        for (int i = 0; i < list.size(); ) {
            // 获取一个元素 索引就挪动一下
            String key = list.get(i++);
            String value = list.get(i++);

            map.put(key, Integer.valueOf(value));
        }

        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

    }
}
