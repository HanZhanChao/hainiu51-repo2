package com.hainiu.regex;

/**
 * @author HaiNiu
 * @description
 * String类中的API：
 * public boolean matches(String regex)
 * 	判断此字符串是否与给定的正则表达式匹配
 *
 * 	String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
 */
public class Demo02 {

    public static void main(String[] args) {

        String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";

        String email1 = "xxxyyyzzz.com.cn";
        String email2 = "xxx-yyy@zzzcom";
        String email3 = "1234231421";
        String email4 = "88888@qq.com.";

        System.out.println(email1.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));
        System.out.println(email4.matches(regex));

    }
}
