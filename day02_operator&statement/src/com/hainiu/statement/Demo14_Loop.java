package com.hainiu.statement;

import java.net.Socket;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 不同循环的死循环格式
 */
public class Demo14_Loop {

    public static void main(String[] args) {

        /*for (; ; ) {
            System.out.println("我停不下来了~");
        }
        System.out.println("abc");*/ // Unreachable statement

        /*while (true) {
            System.out.println("我停不下来了~");
        }*/

        // break 当满足某个条件时，跳出循环，使循环结束

        // continue 当满足某个条件，本次循环的后续代码不再执行，继续下一次循环

        /*for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
//                break;
                continue;
            }
            System.out.println(i);
        }*/

        // 录入成绩 直到正确为止
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                System.out.println("成绩正确");
                break; // 录入正确 跳出循环
            } else {
                System.out.println("成绩有误，重新录入");
            }
        }
    }
}
