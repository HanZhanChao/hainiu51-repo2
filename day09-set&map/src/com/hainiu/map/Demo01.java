package com.hainiu.map;

import java.util.HashMap;

/**
 * @author HaiNiu
 * @description Set集合其实使用的就是Map集合的键
 * HashMap -- 数据结构针对键，保证键唯一，依赖哈希表
 * TreeMap -- 数据结构针对键，保证键唯一，依赖排序
 * <p>
 * 如何遍历
 */
public class Demo01 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "郭襄");
        map.put("张无忌", "赵敏");
        String v = map.put("杨过", "小龙女");
        System.out.println(v);

        // put 当键不存在时，是存储；当键存在时，覆盖原来的值

        // 根据键删除 键值对   equals比较
//        map.remove("郭靖");

//        map.clear();

        // boolean containsKey(Object key)
//        System.out.println(map.containsKey("杨过"));
//        System.out.println(map.containsKey("过儿"));

        // int size()
        System.out.println(map.size()); // 集合中元素（键值对）的个数

        // V   get(Object key) 通过键获取值
        String value = map.get("张无忌");
        System.out.println(value);

        System.out.println(map);

    }
}
