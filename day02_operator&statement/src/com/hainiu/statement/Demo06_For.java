package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 *
 * for (初始化语句;条件判断语句;条件控制语句) {
 * 	循环体语句;
 * }
 *
 * 1、初始化语句 -- 通常用于初始化一个控制循环的变量，只执行一次
 * 2、条件判断语句 -- 判断条件为真，就执行循环体；为假，就结束循环
 * 3、循环体语句 -- 重复要做的事情
 * 4、条件控制语句 -- 通常就是改变循环的变量，使得循环的条件有可能变成假的，让循环能够停止
 *  回到2继续
 *
 */
public class Demo06_For {
    public static void main(String[] args) {
        // 输出10行 hello world
        int x = 1;
        for (; x <= 10; x++) { // 1 2 3 4... 10
            System.out.println("hello world " + x);
        }
        System.out.println(x);

        System.out.println("==========");

        // 10 - 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
