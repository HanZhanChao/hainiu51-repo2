package com.hainiu.search;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description 普通查找
 */
public class Demo01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int i = Arrays.binarySearch(arr, 4); // 返回 -(插入点 + 1)
        System.out.println(i);

        System.out.println(binarySearch(arr, 4));

    }

    // 定义方法实现在数组中查找某个元素
    public static int search(int[] arr, int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 二分查找
    public static int binarySearch(int[] arr, int key) {

        // 从中间位置找
        int start = 0;
        int end = arr.length - 1;
        // 循环查找 查找的起始位置 超过了结束位置 找不到
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > key) {
                // 目标小 在左边  结束位置挪动到 中间-1
                end = mid - 1;
            } else if (arr[mid] < key) {
                // 目标大 在右边  起始位置挪动到 中间+1
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -(start + 1);
    }


}
