package com.hainiu.apidemo;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * 练习：
 *  "11 101 88 22 77 33 44 55"，请将其中的数据按照从小到大的顺序排列，组成一个新的字符串，仍然使用空格分割。
 *  "11 22 33 44.."
 *
 *  1、将字符串拆分 得到每个数据 split
 *  2、字符串数组默认按照自然顺序排序  不符合要求
 *  3、转整数数组
 *  4、排序
 *  5、拼接字符串
 */
public class Demo06_Integer {
    public static void main(String[] args) {

        String str = "11 101 88 22 77 33 44 55";
        // 拆分
        String[] strArr = str.split("\\s"); // 空字符
        // 转整数数组
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]); // parse 解析
        }
        // 排序
        Arrays.sort(arr);
        // 拼回来
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i < arr.length - 1) {
                builder.append(" ");
            }
        }
        // 结果字符串
        System.out.println(builder.toString());
    }
}
