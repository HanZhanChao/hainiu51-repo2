package com.hainiu.homework;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * ##
 * ##
 * ## ##
 * ## ## ##
 * ## ## ## ## ##
 *
 * 1 1 2 3 5 8 13 21 。。。
 * 从第三项开始 每一项等于前两项的和
 *  黄金分割数列
 *
 * 求第n个月 有多少兔子
 *
 *
 *
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第n月：");
        int month = sc.nextInt();

        // 动态规划   每一项 跟前面的两项有关系
        if (month <= 0) {
            System.out.println(0);
        } else if (month == 1 || month == 2) {
            System.out.println(1);
        } else {
            // 第n个月开始
            int last = 1; // 当前最后一项
            int nextToLast = 1;  // 当前最后一项的前一项
            int answer = 1;// 结果
            // 循环 从第三个月开始
            for (int i = 3; i <= month; i++) {
                answer = last + nextToLast;
                // 下一个
                nextToLast = last;
                last = answer;
            }
            System.out.println(answer);
        }
    }
}
