package com.hainiu.homework;

/**
 * @author HaiNiu
 * @description 定义方法实现，数组的普通查找（查找某个元素在数组中第一次出现的索引，如果没有，返回-1）
 */
public class Demo02 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 5, 8, 2, 5, 3, 7, 4, 5};
        int index = search(arr, 10);
        System.out.println(index);
    }

    // 参数：int[] arr, int value   返回值：int
    public static int search(int[] arr, int value) {
        /*// 定义变量表示查找到的索引位置
        int index = -1;
        // 循环遍历每个元素 依次比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break; // 找到了 结束循环
            }
        }
        return index;*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
