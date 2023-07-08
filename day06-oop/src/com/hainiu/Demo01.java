package com.hainiu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {
        String s = "this is testhello1234helloworld123412this is test aaa34231bigdata2341234this is test2341234this is test aaaaaaaaaa";

        String result = "";
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isChar(c)) {
                temp.append(c);
            } else {
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
                temp.delete(0, temp.length());
            }
            if (i == s.length() - 1) {
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
            }
        }
        System.out.println(result);


    }

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
