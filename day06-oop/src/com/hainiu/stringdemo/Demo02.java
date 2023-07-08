package com.hainiu.stringdemo;


/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) {

        // public String()
        String s1 = new String();
        System.out.println(s1); // 空串
        System.out.println(s1.length());

        // public String(String original)
        String s2 = new String("abc"); // 创建了一个参数的副本  1个或2个

        // public String(byte[] bytes) -- 将字节数组转换为字符串 解码
        byte[] bytes = new byte[]{97, 98, 99, 100, 101};

        String s3 = new String(bytes);
        System.out.println(s3); // abcde

        // public String(byte[] bytes, int offset, int length)

        String s4 = new String(bytes, 1, 3);
        System.out.println(s4);

        // public String(char[] value) -- 把字符数组中的所有字符 组成一个字符串

        char[] arr = new char[]{'a', 'b', '1', '?', '中'};
        String s5 = new String(arr);
        System.out.println(s5);

    }

}
