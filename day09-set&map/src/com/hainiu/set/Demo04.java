package com.hainiu.set;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @author HaiNiu
 * @description TreeSet 存储自定义对象 唯一，对元素排序
 *
 * TreeSet存储元素保证唯一，需要对元素排序
 *      根据compareTo方法的返回值
 *          如果返回值为正数，新添加的元素放到后面
 *          如果返回值为负数，新添加的元素放到前面
 *          如果返回值为0，认为重复，不添加。
 *
 */
public class Demo04 {
    public static void main(String[] args) {

        TreeSet<Teacher> set = new TreeSet<>();

        Teacher t1 = new Teacher("Tom", 20);
        Teacher t2 = new Teacher("Tony", 19);
        Teacher t3 = new Teacher("John", 21);
        Teacher t7 = new Teacher("Rose", 21);
        Teacher t4 = new Teacher("Jack", 22);
        Teacher t5 = new Teacher("Lily", 19);
        Teacher t6 = new Teacher("Lily", 19);

        Collections.addAll(set, t1, t2, t3, t4, t5, t6, t7);

        for (Teacher t : set) {
            System.out.println(t);
        }
    }
}
