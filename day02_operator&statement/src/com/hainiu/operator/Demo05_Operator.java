package com.hainiu.operator;

/**
 * @author HaiNiu
 * @description 三元运算符
 * 布尔表达式 ? 表达式a : 表达式b
 * 实现如果。。。否则。。。的效果
 * 首先计算布尔表达式，如果为true，就取表达式a的结果，否则取表达式b的结果。
 */
public class Demo05_Operator {

    public static void main(String[] args) {

        int a = -10;
        int b = a > 0 ? 1 : 0;
        System.out.println(b);

        System.out.println("=========");
        // 定义两个数，获取两个数的较大值
        int x = 30;
        int y = 20;
        int max = x > y ? x : y;
        System.out.println(max);

        System.out.println("=========");
        // 定义两个人的年龄，计算年龄差。
        int age1 = 25;
        int age2 = 18;
        int subtract = age1 > age2 ? age1 - age2 : age2 - age1;
        System.out.println(subtract);

    }
}
