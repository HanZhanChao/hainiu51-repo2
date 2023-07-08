package com.hainiu.regex;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {

        // qq  5 - 15  第一位不可以是0
        String qq = "[1-9]\\d{4,14}";

        String phone = "1351234567";

        // 校验字符串是否满足手机号的规则
        String regex = "1[3-9]\\d{9}";

        boolean b = phone.matches(regex);
        System.out.println(b);

    }

}
