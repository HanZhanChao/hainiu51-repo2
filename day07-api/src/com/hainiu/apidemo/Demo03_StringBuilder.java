package com.hainiu.apidemo;

/**
 * @author HaiNiu
 * @description
 *
 * 方法实现判断一个字符串是否是回文。对称字符串
 *
 *  上海自来水来自海上
 *
 *  1、 String -- StringBuilder
 *  2、 StringBuilder 反转
 *  3、 StringBuilder -- String
 *  4、比较
 *
 */
public class Demo03_StringBuilder {
    public static void main(String[] args) {
        String s = "上海自来水来自海上";
        System.out.println(isPalindromic(s));
    }


    public static boolean isPalindromic(String str) {
        /*StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String revStr = builder.toString();
        return str.equals(revStr);*/
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
