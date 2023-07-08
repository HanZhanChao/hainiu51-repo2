package com.hainiu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author HaiNiu
 * @description
 * 迭代器 -- 遍历集合中的元素
 *
 * // 获取此集合中元素的迭代器
 * Iterator<E> iterator()
 *      boolean hasNext(); -- 是否有下一个元素
 *      E next(); -- 获取下一个元素
 *
 * jdk5 for-each 语句 也称为 增强for循环
 *  for (Collection集合或者数组中的数据类型 变量名 : Collection集合或者数组对象的名字) {
 *      变量名就代表每个元素
 *  }
 *
 *  实现Iterable接口的对象能够使用for-each 语句遍历，也就是能使用迭代器遍历。
 *
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        // 以ArrayList集合为例
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("linux");
        list.add("mysql");
        list.add("java");
        list.add("big");
//        list.add("data");

        // 遍历 获取集合的迭代器
        Iterator<String> it = list.iterator();
        // 判断是否有元素
        while (it.hasNext()) {
            // 获取的方法 会把指针自动指向下一个元素
            /*System.out.println(it.next());
            System.out.println(it.next());*/ // NoSuchElementException
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("=========");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=========");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
