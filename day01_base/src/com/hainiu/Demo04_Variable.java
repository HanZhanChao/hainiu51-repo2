package com.hainiu;

/**
 * @author HaiNiu
 * @description 变量的使用
 *
 * 1、定义小于等于int的整数，只要保证数据在相应的范围内即可
 * 2、定义long 为了避免int过大超出范围 需要在后面加L标识
 * 3、小数默认是double类型 为了避免float损失精度，定义float类型的数据，后面加F标识
 */
public class Demo04_Variable {
    public static void main(String[] args) {
        // 分别定义8种基本数据类型的变量 并且输出它们的值
        
        // byte
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("---------");
        
        // short
        short s1 = -32768;
        short s2 = 32767;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("---------");


        // int
        int x = 100;
        int y = -200;
        System.out.println(x);
        System.out.println(y);
        System.out.println("---------");

        // long 为了避免int过大超出范围 需要在后面加L标识
        long num = 12345678900L;
        System.out.println(num);
        System.out.println("---------");

        // float 小数默认是double类型 为了避免float损失精度，定义float类型的数据，后面加F标识
        float f = 1.1F;
        System.out.println(f);

        // double 双精度
        double d1 = 2.3333333333333333;
        System.out.println(d1);
        double d2 = -6.66666;
        System.out.println(d2);
        System.out.println("---------");


        // char
        char c1 = 'a';
        char c2 = '0';
        char c3 = '中';
        char c4 = '￥';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        char c = 97;
        System.out.println(c);

        System.out.println('￥' + 0); // char + int

        // boolean
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1);
        System.out.println(flag2);

        boolean f3 = 5 > 3;
        System.out.println(f3);

        System.out.println(b1);

        // 局部代码块
        {
            int xxx = 100;
            System.out.println(xxx);
        }
//        System.out.println(xxx);

    }

}
