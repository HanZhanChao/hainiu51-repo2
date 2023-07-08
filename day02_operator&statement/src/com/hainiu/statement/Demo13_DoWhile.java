package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 * 初始化语句;
 * do {
 * 	循环体语句;
 * 	条件控制语句;
 * } while (条件判断语句);
 *
 * 先执行一次循环体再判断是否执行下一次，至少执行一次
 *
 * cas算法
 *
 */
public class Demo13_DoWhile {

    public static void main(String[] args) {

        // 10行 hello world
        int x = 11;
        do {
            System.out.println("hello world " + x);
            x++;
        } while (x <= 10);

    }
}
