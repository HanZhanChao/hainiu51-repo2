package com.hainiu.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] newArr = new int[arr.length + 1];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]) {
                index++;
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = num;

        System.out.println(Arrays.toString(newArr));
    }

}
