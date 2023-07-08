package com.hainiu.operator;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 输入三个学生的身高（cm），程序计算并输出最高的身高。
 */
public class Test01_Operator {
    public static void main(String[] args) {

        // 键盘录入
        Scanner sc = new Scanner(System.in);

        // 接收三个数据
        System.out.println("请输入第一个学生的身高（cm）：");
        int a = sc.nextInt();
        System.out.println("请输入第二个学生的身高（cm）：");
        int b = sc.nextInt();
        System.out.println("请输入第三个学生的身高（cm）：");
        int c = sc.nextInt();

        // 求最大值
        // 先计算a和b的较大值
        int t = a > b ? a : b;
        // 再与c比较
        int max = t > c ? t : c;

        // 三元运算符可以嵌套使用
//        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("最大身高为：" + max);
        // 测试时将所有的情况都测一下
    }
}
