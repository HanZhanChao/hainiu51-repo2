package com.hainiu.recursion;

/**
 * @author HaiNiu
 * @description
 *
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 *
 */
public class Demo01 {


    public static void main(String[] args) {

        System.out.println(tj(20));


    }

    // 方法
    public static int tj(int n) {
        if (n <= 0) {
            return 0;
        }
        // 出口
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // 规律  n  = n-1  +   n-2
        return tj(n - 2) + tj(n - 1);
    }
}
