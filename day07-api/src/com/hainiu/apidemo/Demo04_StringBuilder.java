package com.hainiu.apidemo;

/**
 * @author HaiNiu
 * @description abc234123412helloworld21341234!@#$this is test1324this is testaaa
 * <p>
 * 获取符合要求的最长的连续子串（可以是英文字母或空格）
 * <p>
 * 1、定义变量存储最终的结果
 * 2、定义变量临时存储每次找到的子串
 * 3、遍历查找
 * 是符合要求 临时存储
 * 不是，与之前找到的比较
 */
public class Demo04_StringBuilder {
    public static void main(String[] args) {
        String s = "hello world this is test this is test abc234123412hello world this is test21341234!@#$hello world this is test this is test1324this";

        String result = ""; // 最终的结果
        StringBuilder temp = new StringBuilder(); // 每次找到的子串

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isChar(c)) {
                // 是
                temp.append(c);
            } else {
                // 不是 与之前找到的比较
                if (temp.length() > result.length()) {
                    // 记录这个更长
                    result = temp.toString();
                }
                // 清空 -- 不管是不是别之前的长，都要清空
                temp.delete(0, temp.length());
            }
            // 如果最后一个字符也是符合要求的 单独处理
            if (i == s.length() - 1 && isChar(c)) {
                if (temp.length() > result.length()) {
                    // 记录这个更长
                    result = temp.toString();
                }
            }
        }

        System.out.println(result);

    }

    // 定义方法实现判断一个字符是否是英文或空格
    public static boolean isChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c == 32) {
            return true;
        }
        return false;
    }
}
