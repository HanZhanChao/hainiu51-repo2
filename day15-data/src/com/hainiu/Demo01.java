package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {

        /*int[] arr = new int[]{100, 7, 66, 2, 96, 88, 48, 76, 46, 26};

        // 找最小值 交换
        int minIndex = getMin(arr);
        swap(arr, 0, minIndex);

        int maxIndex = getMax(arr);
        swap(arr, arr.length - 1, maxIndex);

        for (int i : arr) {
            System.out.println(i);
        }*/
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int getMin(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int getMax(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

}
