package com.hainiu.stringdemo;

import com.hainiu.apidemo1.Student;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * public byte[] getBytes()
 *
 * 替换
 * public String replaceAll(String regex, String replacement)
 *
 *
 * public String trim()
 *
 * // 将任意的数据转换为字符串
 * public static String valueOf(Object obj)
 *
 */
public class Demo11 {

    public static void main(String[] args) {
        String s = "abc你";

        byte[] bytes = s.getBytes();

        System.out.println(Arrays.toString(bytes));

        char[] chars = s.toCharArray();
        System.out.println(chars.length);
        System.out.println(chars);

        String str = "hellojavaworldjavalinux";
        str = str.replaceAll("java", "big");
        System.out.println(str);

        // 去除前后端空格
        String ss = "  hello world      "; // 保留有效数据
        ss = ss.trim();
        System.out.println(ss);


        // 数据转字符串
        String s1 = String.valueOf(100);
        System.out.println(s1);

        String s2 = String.valueOf(2.5);
        System.out.println(s2);

        String s3 = String.valueOf(new Student());
        System.out.println(s3);

        // 数据转字符串  用+ 与空串拼接
        String s4 = 100 + "";
        System.out.println(s4);

    }
}
