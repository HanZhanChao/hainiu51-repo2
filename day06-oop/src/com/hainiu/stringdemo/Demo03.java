package com.hainiu.stringdemo;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {
        String s = "abc你好";
        // public int length()
        System.out.println(s.length()); // 长度

        // public char charAt(int index) 获取该索引上的字符
        char c = s.charAt(0);
        System.out.println(c);

        char c1 = s.charAt(3);
        System.out.println(c1);

        // public String concat(String str)  调用方法的字符与参数拼接到一起 组成一个新的字符串
        String str = s.concat("java");
        System.out.println(str);
    }
}
