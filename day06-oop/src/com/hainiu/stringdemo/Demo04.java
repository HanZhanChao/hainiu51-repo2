package com.hainiu.stringdemo;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description // 字符串遍历   根据索引遍历
 *
 * 键盘输入一个字符串，统计这个字符串中英文字母有多少个？
 * 1、Scanner
 * 2、计数器
 * 3、遍历字符串得到每个字符 判断
 *
 */
public class Demo04 {
    public static void main(String[] args) {

        /*String s = "abc你好";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }*/

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String s = sc.nextLine();
        // 计数器
        int count = 0;
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 判断
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }
        // 输出计数器
        System.out.println("英文字母有：" + count);
    }
}
