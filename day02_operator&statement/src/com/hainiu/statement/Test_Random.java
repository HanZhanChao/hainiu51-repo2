package com.hainiu.statement;

import java.util.Random;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 1、Random
 * 2、创建Random对象
 * 3、调用产生随机数的方法
 * <p>
 * 猜数字小游戏
 * 1、系统产生一个随机数
 * 2、键盘录入一个整数
 * 3、循环猜
 * 如果猜大了，给出提示
 * 如果猜小了，给出提示
 * 如果猜对，结束游戏
 */
public class Test_Random {

    public static void main(String[] args) {
        /*
        // 创建Random对象
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // 调用方法
            int num = random.nextInt(10); // 从0-10之间产生一个随机数  包含0 不包含边界10
            System.out.println(num);
        }
        */

        // 系统产生一个随机数
        Random random = new Random();
        // 1 - 100
        int randomNumber = random.nextInt(100) + 1;
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);

        // 死循环
        while (true) {
            System.out.println("请输入要猜的数字");
            int num = sc.nextInt();
            // 比较
            if (num > randomNumber) {
                System.out.println("猜大了");
            } else if (num < randomNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜，猜中了");
                break; // 猜中了，结束循环
            }
        }
    }
}
