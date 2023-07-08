package com.hainiu.sort;

import com.hainiu.search.Demo01;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description 插入排序
 *
 */
public class Demo03_InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};

        insertSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // 插入排序
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // 外层循环控制总的比较轮数
        for (int i = 1; i < arr.length; i++) {
            // 内层循环 当前元素插入到合适位置  从i-1索引 反向扫描
            for (int j = i - 1; j >= 0; j--) {
                // 如果元素小，往前交换
                if (arr[j] > arr[j + 1]) {
                    // 交换
                    Demo01_BubbleSort.swap(arr, j , j + 1);
                } else {
                    // 如果不小，找到位置 循环结束
                    break;
                }
            }
        }
    }

}
