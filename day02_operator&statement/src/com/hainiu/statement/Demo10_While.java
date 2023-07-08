package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 *
 * 初始化语句;
 * while (条件判断语句) {
 * 	    循环体语句;
 *     条件控制语句;
 * }
 * 1、初始化语句
 * 2、条件判断语句
 * 3、循环体语句
 * 4、条件控制语句
 * 回到2
 *
 * 明确循环的次数用for
 * 不明确循环的次数用while
 */
public class Demo10_While {
    public static void main(String[] args) {
        // 打印10行 hello world
        int i = 1;
        while (i <= 10) {
            System.out.println("hello world " + i);
            i++;
        }
        System.out.println(i);
    }
}
