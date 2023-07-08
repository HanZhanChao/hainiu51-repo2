package com.hainiu.array1;

import java.util.concurrent.BlockingDeque;

/**
 * @author HaiNiu
 * @description
 *
 * int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
 * 在原上数组反转
 *
 * 1、第一个元素与最后一个交换
 *  第二个元素与倒数第二个交换
 *  。。。
 * 2、定义两个指针分别指向开始和结束位置
 *      交换完毕数据 开始指针往后走  结束指针往前走 直到相遇
 *
 * 数组的元素是有索引的，灵活地通过索引操作元素。
 */
public class Demo06_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 定义两个指针分别指向开始和结束位置
        int start = 0;
        int end = arr.length - 1;
        // 循环
        while (start < end) {
            // 交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // 开始指针往后走  结束指针往前走
            start++;
            end--;
        }
        // 循环结束 相遇 交换完毕
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
