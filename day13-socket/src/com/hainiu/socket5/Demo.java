package com.hainiu.socket5;

import java.util.UUID;


/**
 * @author HaiNiu
 * @description UUID -- 32位随机的字符串
 * id 一条信息的唯一标识
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String s = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(s);
        }

    }
}
