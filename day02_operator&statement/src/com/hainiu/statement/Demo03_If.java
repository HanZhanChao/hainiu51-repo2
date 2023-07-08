package com.hainiu.statement;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 格式：
 * if (关系表达式1) {
 *     语句体1;
 * } else if (关系表达式2) {
 *     语句体2;
 * }
 * …
 * else {
 *     语句体n+1;
 * }
 *
 * 从上往下依次判断每一个if的条件
 *      如果满足该条件，就执行该if所控制的语句体，if语句就结束
 *      如果都不满足，执行最终的else控制的语句体
 *
 * 对多种情况作出判断，选择其中一种情况来执行。
 */
public class Demo03_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩（0~100）");
        int score = sc.nextInt();

        // 对成绩进行判断并分级 90 A ；  80~89 B； 70~79 C；60~69 D；0~59 E
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("E");
        } else {
            System.out.println("输入的成绩有误");
        }
    }
}
