package com.hainiu.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author HaiNiu
 * @description
 *
 * helloworldJAVA23134!@#$
 * 每个字符出现的次数
 *
 *  利用map集合的特点 键唯一，当添加数据时 键重复，值会覆盖
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String s = sc.nextLine();

        // 创建Map集合  以字符作键 以字符出现的次数作值
        TreeMap<Character, Integer> map= new TreeMap<>();

        // 遍历字符串得到每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            /*// 判断是否包含该键
            if (map.containsKey(c)) {
                // 再次出现 获取原来的值+1
                map.put(c, map.get(c) + 1);
            } else {
                // 首次出现 值就是1
                map.put(c, 1);
            }*/
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        // 遍历查看结果
        map.forEach((k, v) -> System.out.println(k + "出现的次数是：" + v));
    }
}
