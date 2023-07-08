package com.hainiu;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Exercise05 {

    public static void main(String[] args) {

        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));

        int topK = getTopK(arr, 5);
        System.out.println(topK);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int getTopK(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        return getTopK(arr, i, j, k);
    }

    // 快速排序
    private static int getTopK(int[] arr, int low, int high, int target) {
        int i = low;
        int j = high;
        int temp;
        while (i < j) {
            while (arr[j] >= arr[low] && i < j) {
                j--;
            }
            while (arr[i] <= arr[low] && i < j) {
                i++;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        if (target == j) {
            return arr[j];
        } else if (target < j) {
            return getTopK(arr, low, j-1, target);
        } else {
            return getTopK(arr, j+1, high, target);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
