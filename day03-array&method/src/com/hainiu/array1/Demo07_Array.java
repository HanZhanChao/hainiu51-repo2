package com.hainiu.array1;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * int[] arr = {10, 20, 30, 40, 50};
 *  // 再输入一个整数，存入数组中。
 *  数组如何扩容？
 *  Java语言中数组长度固定，无法将这个元素存入；如果有更多的元素需要存储，那么需要新建数组。
 *  将原数组中的元素拷贝到新数组。
 *
 *  原数组是大小有序的，请你把新元素插入到合适的位置，保证新数组仍然有序。时间复杂度是O(n),元素只能遍历一次。
 */
public class Demo07_Array {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        // 键盘输入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        // 定义新数组
        int[] newArr = new int[arr.length + 1];
        // 将原数组中的元素拷贝到新数组。
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // 最后一个位置留给新数据
        newArr[newArr.length - 1] = num;

        // 再把新数组 覆盖原数组引用
        arr = newArr;

        // 遍历新数组查看结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
