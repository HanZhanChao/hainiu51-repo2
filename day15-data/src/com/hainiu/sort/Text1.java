package com.hainiu.sort;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * 动态规划 ： 求两个字符串的最长公共子序列
 *      “abcjavaabcjavaee”
 *      "hellojavahellocjava"
 *
 */
public class Text1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入台阶数：");
        int num = scanner.nextInt();
        System.out.println(numWay(num));

    }

    /*
        动态规划
        f(x) = f(x-1) + f(x-2)
        1 -- 1
        2 -- 2
        1  2  3  5  8  13...
                n-2   n-1    n  n+1
     */

    public static int numWay(int n){
        if (n <= 0) return 0;
        // 计算
        int num = 0;
        int pre = 2; // 当前项的前一项
        int last = 1; // 当前项有关的最后一项

        if (n == 1) return 1;
        if (n == 2) return 2;
        // 从第三项开始
        for (int i = 3; i <= n; i++) {
            num = pre + last;
            // 计算下一项
            last = pre;
            pre = num;
        }
        return num;
    }
}
