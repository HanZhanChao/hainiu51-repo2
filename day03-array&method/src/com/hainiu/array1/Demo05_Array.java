package com.hainiu.array1;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * 不死神兔问题
 *      第n项 = 第n-1项 + 第n-2项
 */
public class Demo05_Array {

    public static void main(String[] args) {
        // 使用数组中的每一项作为每个月的兔子对数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月数：");
        int month = sc.nextInt();

        // 健壮性
        if (month <= 0) {
            System.out.println("月数有误");
            return; // 将方法结束
        }

        // 数组
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;

        // 从第三项开始 第n项 = 第n-1项 + 第n-2项
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        // 数组的最后一项即为所求
        System.out.println(arr[arr.length - 1]);

        /*System.out.println("----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}
