package com.hainiu;

import sun.java2d.pipe.SpanIterator;

/**
 * @author HaiNiu
 * @description
 *
 * 数据类型 变量名 = 初始化值; // 声明变量并赋值
 *
 */
public class Demo03_Variable {

    public static void main(String[] args) {

        int age = 18; // 声明一个整数类型的变量，变量名为age，使用18为变量age赋值

        // 使用变量直接使用变量名
        System.out.println(age);

        age = 19; // 修改
        System.out.println(age);

        System.out.println("-------");

        int a; // 先声明变量
        a = 10; // 再赋值
        System.out.println(a);

        System.out.println("-------");
        int x = 10, y = 20; // 定义两个int类型的变量
        System.out.println(x);
        System.out.println(y);

    }
}
