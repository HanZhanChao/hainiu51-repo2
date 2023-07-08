package com.hainiu.homework;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 插入数据后仍然保证数组有序，时间复杂度是O(n),元素只能遍历一次。
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        // 定义新数组 长度+1
        int[] newArr = new int[arr.length + 1];

        // 找到这个元素存入的位置
        // 遍历数组中的元素 使用新数据进行比较 如果新数大，那么它的位置往后走
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]) {
                index++;
                // 当前元素存入新数组的相同索引位置
                newArr[i] = arr[i];
            } else {
                // 找到位置了，给新元素留下，原数组中其他元素 索引+1 存入新数组
                newArr[i + 1] = arr[i];
            }
        }
        // 存入新元素
        newArr[index] = num;

        // 覆盖
        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
