package com.hainiu.array2;

/**
 * @author HaiNiu
 * @description
 * 1、二维数组中每个一维数组长度是相同吗？
 *      定义二维数组时，只需填写二维数组的长度就可以编译通过
 *      此时说明二维数组的长度为3，但是目前没有存储任何的一维数组
 *
 * 2、二维数组存储一维数组，存的是一维数组的引用。
 */
public class Demo02_Array2 {

    public static void main(String[] args) {
        int[][] arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);

        // 定义一维数组存入二维数组
        int[] a1 = {1, 2, 3};
        arr[0] = a1;
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        int[] a2 = {4, 5};
        arr[1] = a2;
        System.out.println(arr[1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

    }
}
