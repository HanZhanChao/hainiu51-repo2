package com.hainiu.statement;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 格式：
 * if (布尔表达式) {
 *     语句体1;
 * } else {
 *     语句体2;
 * }
 *
 * 如果 否则的效果
 *
 * 对两种对立的情况作出判断
 *      如果满足条件就执行语句体1
 *      否则就执行语句体2
 *
 */
public class Demo02_If {
    public static void main(String[] args) {
        // 判断奇偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        // 判断
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
