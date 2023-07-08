package com.hainiu;

/**
 * @author HaiNiu
 * @description 验证静态变量的初始化过程
 */
public class Demo {


//    private static int x = 10; // 默认初始化为0  显式赋值为10  静态代码块赋值为20
    static {
        x = 20;
    }

    private static int x = 10; // 默认初始化为0  静态代码块赋值为20  显式赋值为10


    public static void main(String[] args) {
        int y = x++;
        System.out.println(x); // 21
        System.out.println(y); // 20
    }

}
