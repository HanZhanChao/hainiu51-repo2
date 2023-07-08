package com.hainiu.stringdemo;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 模拟用户登录的动作
 */
public class Demo06 {

    public static void main(String[] args) {

        // 用变量表示已经注册的用户名和密码
        String username = "admin";
        String password = "123456";

        // 输入用户名和密码
        Scanner sc = new Scanner(System.in);
        // 与注册的比较 -- 5次
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String word = sc.nextLine();
            // 判断
            if (username.equals(name) && password.equals(word)) {
                System.out.println("欢迎" + username);
                break; // 登录成功 跳出循环
            } else {
                System.out.println("您输入的用户名或密码错误，请重新登录，您还有" + (4 - i) + "次机会");
            }
        }
    }
}
