package com.hainiu.operator;

/**
 * @author HaiNiu
 * @description 算术运算符
 */
public class Demo01_Operator {

    public static void main(String[] args) {
        // Java中的字符串连接符 + 可以将任意的数据与字符串连接到一起 组成一个新的字符串
        String a = "hello";
        String b = "world";
        String c = a + b;
        System.out.println(c);

        String d = a + 100 + 2.5 + 'c' + true; // 字符串的拼接
        System.out.println(d);

        String e = 1 + 2 + a + 3 + 4; // 注意优先级问题
        System.out.println(e);

        int result = 100;
        System.out.println("运算的结果是：" + result);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3); // double int   小的数据类型自动提升成大的数据类型做运算

        System.out.println(10 % 3);


        double x = 1.9;
//        double y = 1.10;
        System.out.println(x == (1.1 + 0.8));

    }

}
