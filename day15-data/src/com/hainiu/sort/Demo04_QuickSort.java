package com.hainiu.sort;

import java.util.Arrays;
import java.util.Random;

import static com.hainiu.sort.Demo03_InsertSort.insertSort;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04_QuickSort {


    public static void main(String[] args) {
//        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};

        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // 快速排序的入口函数
    public static void quickSort(int[] arr) {
        quickSort(arr, 0 , arr.length - 1);
    }

    /**
     * 快速排序
     * @param arr
     * @param start  本轮排序的起始位置
     * @param end  本轮排序的结束位置
     */
    public static void quickSort(int[] arr, int start, int end) {
        // 出口 如果起始位置小于结束位置 进行排序
        if (start < end) {
            // 记录本次的排序范围
            int i = start;
            int j = end;

            // 记录基准值 参与排序的第一个元素
            int pivot = arr[i];
            // 当起始位置小于结束位置时
            while (i < j) {
                // 从右边查找比基准值小的
                while (arr[j] >= pivot && i < j) { // 由于j可能会自减多次，每次也要判断是否还大于i
                    j--;
                }
                // 如果是找到了比基准值小的，填坑
                if (i < j) {
                    arr[i] = arr[j];
                    i++; // 左边需要查找的位置 指向下一个
                }
                // 从左边查找比基准值大的
                while (arr[i] <= pivot && i < j) {
                    i++;
                }
                // 填坑
                if (i < j) {
                    arr[j] = arr[i];
                    j--; // 右边需要查找的位置 指向前一个
                }
            }
            // 找到基准值的位置
            arr[i] = pivot;

            // 将基准值左右两边 分别重复上面的过程
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }
}
