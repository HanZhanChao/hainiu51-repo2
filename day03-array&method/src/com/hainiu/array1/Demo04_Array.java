package com.hainiu.array1;

/**
 * @author HaiNiu
 * @description 从数组的所有元素中找出最大值。
 */
public class Demo04_Array {

    public static void main(String[] args) {

        // 准备数组
        int[] arr = {1, 6, 9, 8, 2, 3, 7, 4, 5};

        // 取第一个元素出来，假设它是最大值
        int max = arr[0];
        // 从第二个元素开始 依次比较
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // 出现了更大的值
                max = arr[i];
            }
        }
        // 循环结束 所有元素比较完毕，max记录的就是最大值
        System.out.println(max);
    }
}
