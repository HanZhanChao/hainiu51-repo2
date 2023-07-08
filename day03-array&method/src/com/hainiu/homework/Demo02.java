package com.hainiu.homework;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 张三学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。
 * 电梯每次可以乘坐12人，每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。
 * 假设最初电梯在1层，请帮助张三计算还需要多少分钟才能乘电梯到达楼上。
 */
public class Demo02 {

    public static void main(String[] args) {
        // 判断乘坐几次

        // 输入等待的人数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入等待的人数");
        int n = sc.nextInt();

        // 一次上楼的时间
        int time = 2;

        // 判断
        if (n < 12) {
            System.out.println(time);
        } else if (n == 12) {
            System.out.println(time * 3);
        } else {
            // 大于12
            int a = n / 12 * (time*2) + time;
            System.out.println(a);
        }
    }
}
