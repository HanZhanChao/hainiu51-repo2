package com.hainiu.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Demo06_MergeSort {


    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};


        /*int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));*/

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // 归并排序的入口方法
    public static void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];

        mergeSort(arr, 0, arr.length - 1, tempArr);
    }

    /**
     *
     * @param arr 要排序的数组
     * @param start  本轮归并排序的起始位置
     * @param end  本轮归并排序的结束位置
     * @param tempArr 临时空间
     */
    private static void mergeSort(int[] arr, int start, int end, int[] tempArr) {

        // 出口
      /*  if (start == end) {
            return;
        }*/


        if (start < end) {
            // 找中间位置
            int mid = (start + end) / 2;
            // 分解
            mergeSort(arr, start, mid, tempArr);
            mergeSort(arr, mid + 1, end, tempArr);

            // 合并
            // 本次合并 左右两个数组合并为一个大数组
            // 本次左边数组的起始位置
            int leftPos = start;
            // 本次左边数组的结束位置
            int leftEnd = mid;
            // 本次右边数组的起始位置
            int rightPos = mid + 1;
            // 本次右边数组的结束位置
            int rightEnd = end;

            // 本次合并有多少元素
            int nums = rightEnd - leftPos + 1;

            // 合并升序的数组 在tempArr临时空间操作
            // 存入临时空间的位置
            int tempIndex = leftPos;

            while (leftPos <= leftEnd && rightPos <= rightEnd) {
                if (arr[leftPos] <= arr[rightPos]) {
                    tempArr[tempIndex++] = arr[leftPos++];
                } else {
                    tempArr[tempIndex++] = arr[rightPos++];
                }
            }
            // 将没拷贝完的继续
            while (leftPos <= leftEnd) {
                tempArr[tempIndex++] = arr[leftPos++];
            }

            while (rightPos <= rightEnd) {
                tempArr[tempIndex++] = arr[rightPos++];
            }

            // 将数组从临时空间 拷贝回 原数组
            for (int i = 0; i < nums; i++, rightEnd--) {
                arr[rightEnd] = tempArr[rightEnd]; // 从右边
            }
        }
    }
}
