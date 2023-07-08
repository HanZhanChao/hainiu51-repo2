package com.hainiu.exception;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * 一个try语句可以有多个catch语句 来捕获多个异常
 */
public class Demo04 {

    public static void main(String[] args) {

        // 通过键盘录入学生的姓名和年龄 创建对象并输出

        Scanner sc = new Scanner(System.in);

        // 创建对象
        Student s = new Student();

        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        s.setName(name);

        // 循环录入年龄
        while (true) {
            try {
                System.out.println("请输入年龄：");
                String ageStr = sc.nextLine();
                // 将年龄转成整数
                int age = Integer.parseInt(ageStr); // NumberFormatException -- 数字格式化异常
                s.setAge(age); // AgeOutOfBoundsException 自定义的异常
                System.out.println(s);
                // 如果对象正常输出 说明什么异常都没有 停止循环
                break;
            } catch (NumberFormatException e) {
                // 捕获数字格式化异常 打印信息
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                // 捕获自定义的异常 打印信息
                e.printStackTrace();
            }
        }
    }

}
