package com.hainiu.apidemo1;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) {

        /*Object o1 = new Object();

//        Object o2 = new Object();
        Object o2 = o1;

        boolean b = o1.equals(o2);
        System.out.println(b);*/

        // == 比较  基本数据类型 比较值
        // == 比较  基本引用类型  比较的是引用

        // 认为所有属性都想同的对象 相等对象
        Student s1 = new Student("Tom", 20);
        Student s2 = new Student("Tom", 20);

        System.out.println(s1);
        System.out.println(s1.toString());

        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

}
