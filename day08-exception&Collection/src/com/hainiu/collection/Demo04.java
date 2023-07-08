package com.hainiu.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @author HaiNiu
 * @description
 *
 * LinkedList方便地在头尾操作元素
 *
 * 1-108 卡片，编号， 拿起一张扔掉，再拿起一张放到下面，那么请问最后剩下谁？
 *
 * LinkedList
 *
 */
public class Demo04 {

    public static void main(String[] args) {

        // 定义集合存储1-108
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // 循环操作
        while (list.size() > 1) {
            // 删除第一个元素
            list.removeFirst();
            // 删除第一个元素，存储到最后
            list.addLast(list.removeFirst());
        }
        Integer first = list.getFirst();
        System.out.println(first);


       /*
       LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.addFirst("ddd");
        list.addLast("eee");

//        System.out.println(list.getFirst());
//        System.out.println(list.removeLast());
        System.out.println(list);
        */

    }
}
