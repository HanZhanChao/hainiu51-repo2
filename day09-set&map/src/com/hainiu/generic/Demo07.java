package com.hainiu.generic;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author HaiNiu
 * @description
 *
 * 比较器的泛型 规定了泛型的下边界
 *
 * 对K或者K类型的父类型提供排序规则， K类型就可以存入集合了。
 *
 * public TreeSet(Comparator<? super K> comparator)
 */
public class Demo07 {

    public static void main(String[] args) {

        // 集合中要存储Worker对象

        // 集合中存储的是Worker类   比较器接收的也是Worker类型
        /*TreeSet<Worker> set = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // 集合中存储的是Worker类   比较器接收的是Worker的父类型
        TreeSet<Worker> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        set.add(new Worker("Tom", 21));
        set.add(new Worker("Jerry", 20));
        set.add(new Worker("Jack", 20));

        set.forEach(w -> System.out.println(w));
    }
}
