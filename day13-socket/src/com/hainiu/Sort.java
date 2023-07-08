package com.hainiu;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 */
public class Sort {

    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] array) {
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tempArr, int left, int right) {

        if (left < right) {
            // 中间
            int center = (left + right) / 2;

            mergeSort(arr, tempArr, left, center);
            mergeSort(arr, tempArr, center + 1, right);

            // 合并
            int leftPos = left;
            int leftEnd = center;
            int rightPos = center + 1;
            int rightEnd = right;

            // 本次合并的元素个数
            int numElements = rightEnd - leftPos + 1;

            // 存入数组的位置
            int tempPos = left;

            while (leftPos <= leftEnd && rightPos <= rightEnd) {
                if (arr[leftPos] <= arr[rightPos]) {
                    tempArr[tempPos++] = arr[leftPos++];
                } else {
                    tempArr[tempPos++] = arr[rightPos++];
                }
            }

            while (leftPos <= leftEnd) {
                tempArr[tempPos++] = arr[leftPos++];
            }

            while (rightPos <= rightEnd) {
                tempArr[tempPos++] = arr[rightPos++];
            }

            // 将临时空间的拷贝到原数组
            for (int i = 0; i < numElements; i++, rightEnd--) {
                arr[rightEnd] = tempArr[rightEnd];
            }

        }

    }
}
