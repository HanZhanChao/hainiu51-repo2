package com.hainiu;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        int[][] arr = new int[line][];

        // line 行的杨辉三角
        for (int i = 0; i < line; i++) {
            // 每一行的数字个数也是line
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
