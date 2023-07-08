package com.hainiu.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 *
 * 1、使用集合对象时，用引用数据类型（集合中存储的数据类型）替换泛型
 * 元素 -- Element
 *
 * 删除 delete remove
 *
 * 2、Collection集合的API
 * // 添加元素
 * boolean add(E e)
 *
 * // 删除所有元素 清空
 * void clear()
 *
 * // 删除指定的元素 -- 根据equals比较进行匹配，只删除第一个匹配
 * boolean remove(Object o)
 *
 * // 根据条件删除元素 -- 符合条件的全部删除
 * default boolean removeIf(Predicate<? super E> filter)
 *
 * // 判断是否包含指定的元素
 * boolean contains(Object o)
 *
 * // 判断集合是否为空（即集合长度为0）
 * boolean isEmpty()
 *
 * // 获取集合的长度（即元素的个数）
 * int size()
 *
 * // 将集合转换为Obejct数组
 * Object[] toArray()
 *
 * // 将集合转换为指定数据类型的数组
 * <T> T[] toArray(T[] a)
 *
 * // 获取此集合中元素的迭代器
 * Iterator<E> iterator()
 */
public class Demo01 {

    public static void main(String[] args) {

        // 以ArrayList集合为例
        ArrayList<String> list = new ArrayList<>(); // JDK7  菱形运算符
        list.add("java");
        list.add("linux");
        list.add("mysql");
        list.add("java");
        list.add("big");
        list.add("data");

//        list.clear();

        // 从第一个元素开始 做equals比较  删除第一个匹配
//        list.remove("java");

        //  removeIf(Predicate<? super E> filter) 将符合条件的数据全部移除，什么条件需要我们实现接口

//        list.removeIf(s -> s.length() <= 4);

//        System.out.println(list.contains("bigdata"));

//        System.out.println(list.isEmpty());

        // 数组的长度 length属性   字符串的长度length()方法  集合的长度size()方法
        /*int size = list.size();
        System.out.println(size);*/

        // 泛型如果不写，集合中的数据类型 默认为Object类型
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(list);

    }

}
