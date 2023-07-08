package com.hainiu.lambda;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 *
 * Arrays 的排序方法 对字符串数组排序 默认按照自然顺序排序
 *
 */
public class Test {

    public static void main(String[] args) {

        String[] arr = new String[]{"Tom", "Jerry", "Bob", "John", "Tony"};

        Arrays.sort(arr);

        String s = Arrays.toString(arr);
        System.out.println(s);

        // 按照字符串的长度排序
        // int compare(T o1, T o2);
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());

        String s2 = Arrays.toString(arr);
        System.out.println(s2);

    }

}
