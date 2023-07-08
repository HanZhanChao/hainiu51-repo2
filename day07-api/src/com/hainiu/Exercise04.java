package com.hainiu;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Exercise04 {

    public static void main(String[] args) {

        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));

        int topK = getTopK(arr, 5);
        System.out.println(topK);


    }

    public static int getTopK(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int t = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[t]) {
                    t = j;
                }
            }
            if (t != i) {
                swap(arr, t, i);
            }
        }
        return arr[k - 1];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
