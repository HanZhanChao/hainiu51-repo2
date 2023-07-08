package com.hainiu.array1;

/**
 * @author HaiNiu
 * @description 数组遍历
 *
 * 求和
 *
 */
public class Demo03_Array {

    public static void main(String[] args) {
        // 静态初始化
        int[] arr = {11, 22, 33, 34, 35, 36, 37, 38, 39};
        // 循环获取所有的索引
        /*for (int i = 0; i < arr.length; i++) { // 0 ~ length-1
            System.out.println(arr[i]);
        }*/

        // 定义变量保存和
        int sum = 0;

        // 数组名.fori + enter
        for (int i = 0; i < arr.length; i++) {
            // 累加
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
