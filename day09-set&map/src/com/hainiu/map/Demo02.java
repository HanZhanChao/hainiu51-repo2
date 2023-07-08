package com.hainiu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author HaiNiu
 * @description
 *
 * 先获取所有的键，通过键获取值。
 * 先获取所有的键值对，通过键值对获取键和值
 */
public class Demo02 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("许仙", "白娘子");
        map.put("范喜良", "孟姜女");

        // Set<K> keySet() -- 获取所有的键
        Set<String> keySet = map.keySet();
        // 获取每一个键
        for (String key : keySet) {
            // 通过键获取值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("===========");
        // 获取所有的键值对映射关系
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历每一个键值
        for (Map.Entry<String, String> entry : entrySet) {
            // 获取键
            String key = entry.getKey();
            // 获取值
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
