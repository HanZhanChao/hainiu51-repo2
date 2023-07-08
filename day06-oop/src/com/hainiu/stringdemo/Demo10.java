package com.hainiu.stringdemo;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * public String[] split(String regex)
 *     将调用方法的字符串按照指定的regex的匹配进行拆分，返回拆分后的字符串数组。
 */
public class Demo10 {
    public static void main(String[] args) {

        /*String str = "aaa,bbb,ccc";

        // 使用逗号将字符串拆分
        String[] arr = str.split(",");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));*/

        /*// 按照规则拆分 正则表达式  .代表任意字符
        String str = "aaa.bbb.ccc";

        // 使用逗号将字符串拆分
        String[] arr = str.split("\\."); // 代表.本身
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));*/


        // 如果规则连续匹配，会拆分出一个空串，如果在开始和中间位置，会保留；如果在末尾，不保留
        String str = ",,aaa,,bbb,ccc,,";

        // 使用逗号将字符串拆分
        String[] arr = str.split(",");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
