package com.hainiu.homework;

/**
 * @author HaiNiu
 * @description
 * 定义方法实现，获取数组的一部分，
 *     （需要的参数是：一个数组，一个开始索引 fromIndex，一个长度 len，实现的目标是从该索引fromIndex位置获取，一共获取len个元素，组成一个新数组）
 *     无需判断索引的范围，超出就报错。
 */
public class Demo03 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 5, 8, 2, 5, 3, 7, 4, 5};

        int[] result = arrayCopy(arr, 1, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] arrayCopy(int[] arr, int fromIndex, int len) {
        int[] result = new int[len];
        // 从fromIndex开始遍历 拷贝
       /* int index = 0;

        for (int i = fromIndex; i < fromIndex + len; i++) {
            // 放到result中 从0索引放
            result[index++] = arr[i];
        }*/

        for (int i = fromIndex; i < fromIndex + len; i++) {
            // 放到result中 从0索引放
            result[i - fromIndex] = arr[i];
        }
        return result;
    }
}
