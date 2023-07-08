package com.hainiu.array2;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_Array2 {

    public static void main(String[] args) {
        // 数据类型[][] 数组名 = new 数据类型[m][n];
        int[][] arr = new int[3][2]; // 定义了一个长度为3的二维数组，每个一维数组可以存储2个元素
        System.out.println(arr); // [[I@1b6d3586
        System.out.println(arr[0]); // [I@4554617c
        System.out.println(arr[0][0]); // 索引为0的一维数组中的索引为0的元素
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        // {{0, 0}, {0, 0}, {0, 0}}

        // 数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1, 元素2}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
    }
}
