package com.hainiu.exam;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {
    public static void main(String[] args) {
        // 请输入一个字符串，统计这个字符串中，英文字符和数字字符分别出现多少个。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();

        // 计数器
        int count1 = 0;
        int count2 = 0;

        // 遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                count2++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
