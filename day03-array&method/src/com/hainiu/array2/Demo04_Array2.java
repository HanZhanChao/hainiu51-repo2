package com.hainiu.array2;

import org.omg.CORBA.IRObject;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 打印n行的杨辉三角
 *
 * 每一行第一个和最后一个数字是1
 * 其他数字 = 上一行肩膀上两个数字之和
 */
public class Demo04_Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入杨辉三角的行数：");
        int n = sc.nextInt();
        triangle(n);
    }

    /**
     * 打印n行的杨辉三角
     * @param n
     */
    public static void triangle(int n) {
        if (n <= 0) {
            return;
        }
        // 定义二维数组表示所有的数据
        int[][] arr = new int[n][];
        // 循环定义每一行
        for (int i = 0; i < arr.length; i++) {
            // 索引为i的行 有i+1个元素
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == i) {
                    // 每一行第一个和最后一个数字是1
                    arr[i][j] = 1;
                } else {
                    // 其他数字是它上方的两个数字之和
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                // 打印每一行的元素
                System.out.print(arr[i][j] + "\t");
            }
            // 换行
            System.out.println();
        }
    }
}
