package com.hainiu.sort;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description 合并两个升序的数组 要求算法时间复杂度为O(n)
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 5, 8, 8, 9};
        int[] arr2 = {2, 3, 3, 5, 7, 7};

        int[] arr = new int[arr1.length + arr2.length];

        // 定义两个指针分别指向两个数组的起始位置
        int i = 0;
        int j = 0;

        // 定义第三个指针指向新数组的起始位置
        int k = 0;

        // 其中一个数组拷贝完毕 结束
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        // 将没拷贝完毕的继续拷贝
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(arr));
    }
}
