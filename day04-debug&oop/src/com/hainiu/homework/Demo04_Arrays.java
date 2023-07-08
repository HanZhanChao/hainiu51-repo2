package com.hainiu.homework;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 *
 * Arrays
 * 该类包含用于操作数组的各种方法，调用方式是  类名.方法名()
 *      public static int binarySearch(int[] a, int key)
 *          二分查找的使用前提 数组必须有序
 *
 *      public static int[] copyOf(int[] original, int newLength)
 *          拷贝数组中的元素组成一个新数组  新数组的长度是newLength，如果原数组中的数据不够，就用零填充
 *
 *      public static void sort(int[] a)
 *          对数组中的元素排序
 *
 *      public static String toString(int[] a)
 *          把参数数组中的元素拼接成一个字符串
 *
 * System类中
 *      public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
 *      native -- 本地方法
 *          src -- 源数组
 *          srcPos -- 源数组的起始索引
 *          dest -- 目标数组
 *          destPos -- 目标数组的起始索引
 *          length -- 拷贝长度
 */
public class Demo04_Arrays {
    public static void main(String[] args) {
        /*
        // 演示二分查找
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int i = Arrays.binarySearch(arr, -1); // -(插入点+1)
        System.out.println(i);
        */

        /*
        // 演示Arrays类的数组拷贝
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int[] newArr = Arrays.copyOf(arr, 5);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        */

        /*
        // 演示System类的数组拷贝
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 7, newArr, 0, 1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        */

        /*
        // 演示对数组元素排序
        int[] arr = {1, 6, 9, 5, 8, 2, 5, 3, 7, 4, 5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        */

        // 演示数组元素转成字符串
        int[] arr = {1, 6, 9, 5, 8, 2, 5, 3, 7, 4, 5};
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
