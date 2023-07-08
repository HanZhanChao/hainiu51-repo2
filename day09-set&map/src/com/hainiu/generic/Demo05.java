package com.hainiu.generic;

import sun.util.locale.provider.TimeZoneNameUtility;

import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 * Collection接口中的一个方法：
 *      boolean addAll(Collection<? extends E> c);
 *      将参数集合中的所有元素添加到调用方法的集合中。
 *
 *      Collection<E> 接口的泛型是E
 *      Collection<? extends E> 参数的泛型是E或者E的子类型都可以
 */
public class Demo05 {
    public static void main(String[] args) {

        // 定义集合
        ArrayList<Fu> list = new ArrayList<>();
        list.add(new Fu());
        list.add(new Fu());

        /*
        ArrayList<Fu> list1 = new ArrayList<>();
        list1.add(new Fu());
        list1.add(new Fu());

        list.addAll(list1);
        System.out.println(list.size());
        */

        // 父类引用可以接收子类对象
        ArrayList<Zi> list2 = new ArrayList<>();
        list2.add(new Zi());
        list2.add(new Zi());

        list.addAll(list2);
        System.out.println(list.size());
    }


}

class Fu { }

class Zi extends Fu {}