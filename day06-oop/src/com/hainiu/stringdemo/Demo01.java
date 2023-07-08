package com.hainiu.stringdemo;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {
    public static void main(String[] args) {

        String s = "hello"; // 字符串常量

        s = "world";

        System.out.println(s); // String本身就是字符串 打印字符串的内容

        String s1 = "abc";
        String s2 = "abc"; // 在常量池发现有这个数据了，共享复用
        System.out.println(s1 == s2); // true
    }
}
