package com.hainiu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * 对于给定的数组，移除其任意位置上的一个元素
 */
public class Demo {

    public static void main(String[] args) {

        // JDK7 支持直接其他进制
        System.out.println(0B10101010); // binary
        System.out.println(012); // octal
        System.out.println(0x3C); // hex

        // 0101 -- 5

        ArrayList<Integer> list = new ArrayList<Integer>();



        int[] arr = {1, 2,3};

        change(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void change(int[] arr) {
        int[] newArr = {10, 2, 3};
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }



}
