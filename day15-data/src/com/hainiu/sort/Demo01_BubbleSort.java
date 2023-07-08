package com.hainiu.sort;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }


    // 方法 实现冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        // 外循环 控制总的比较轮数  arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环 控制每轮排序的交换过程  - 1避免索引越界 -i 为了缩小排序范围
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 相邻元素比较
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // 将数组arr中 i索引和j索引位置上的元素交换
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
