package com.hainiu.operator;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 请输入一个三位数的正整数，计算这个数每一位上的数字之和。例如：输入345，每一位上的数字相加3+4+5=12，输出结果12。
 */
public class Test02_Operator {

    public static void main(String[] args) {
        // 输入整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数的正整数：");
        int num = sc.nextInt();

        // 获取每一位上的数字
        /*
            个位：% 10
            十位：/ 10 % 10
            百位：/ 100 % 10
            ...
         */
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        // 计算和
        int result = ge + shi + bai;
        System.out.println("每一位上的数字和是：" + result);
    }
}
