package com.hainiu.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02_SelectionSort {


    public static void main(String[] args) {
        /*int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }*/
        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        // 外层循环控制总的比较轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环 在本轮参与排序的数据中找最小值出现的位置
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // 交换  最小值如果在开始位置出现 没必要交换
            if (index != i) {
                // index是本轮最小元素的索引  i是本轮第一个元素的索引
                Demo01_BubbleSort.swap(arr, i, index);
            }
        }
    }


    // 查找数组中最小值出现的位置
    public static int min(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }


}
