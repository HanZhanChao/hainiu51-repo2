package com.hainiu.collection;

import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        list.add(1, "ddd");

        // 根据索引移除元素，返回值就是被删除的元素
       /* String s = list.remove(1);
        System.out.println(s);*/

       /* String s = list.set(1, "ddd");
        System.out.println(s);*/

        /*String s = list.get(1);
        System.out.println(s);*/

        /*for (String str : list) {
            System.out.println(str);
        }*/

        // list集合 可以使用索引遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
