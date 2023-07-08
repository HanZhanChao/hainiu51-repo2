package com.hainiu;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author HaiNiu
 * @description
 * 请定义一个方法，参数为两个整数数组，返回值也是整数数组，方法实现获取两个数组中元素的交集。
 * 返回值应该包含两个数组中的相同元素，元素顺序不限，但每个相同元素只应该包含一个，也就是取交集部分。
 * 如果没有交集，返回空数组。
 *
 * 请利用Java中集合所学知识，完成上述功能。
 *
 * int -- Integer
 *
 */
public class Demo02 {

    public static void main(String[] args) {

        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4, 5};

        int[] arr = JJ(arr1, arr2);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] JJ(int[] arr1, int[] arr2) {
        // 数组1中的元素去重
        HashSet<Integer> set1 = new HashSet<>();
        // 遍历数组
        for (int num : arr1) {
            set1.add(num);
        }

        // 在第二个数组中 查找集合中存在的元素 即为交集
        HashSet<Integer> set2 = new HashSet<>();
        // 遍历第二个数组
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        // 转为数组
        int[] arr = new int[set2.size()];
        int index = 0; // 存入数组的位置
        for (Integer num : set2) {
            arr[index] = num;
            index++;
        }
        return arr;
    }
}
