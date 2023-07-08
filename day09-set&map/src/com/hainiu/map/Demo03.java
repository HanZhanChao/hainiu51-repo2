package com.hainiu.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author HaiNiu
 * @description
 * Collection Map集合 在8版本添加的遍历方式
 *
 *      消费型接口
 */
public class Demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "fff");

        // jdk8之后 提供了一个方法forEach() 来遍历
        // 这个方法已经遍历集合得到了每个元素，然后将数据传递给了Consumer接口的accept方法；
        // 使用元素做什么操作，需要我们在accept方法实现。
        list.forEach(s -> System.out.println(s));

        System.out.println("-----------");
        HashMap<String, String> map = new HashMap<>();

        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("许仙", "白娘子");
        map.put("范喜良", "孟姜女");

        // BiConsumer接口的accept方法
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

}
