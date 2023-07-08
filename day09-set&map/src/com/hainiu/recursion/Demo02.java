package com.hainiu.recursion;

/**
 * @author HaiNiu
 * @description 斐波那契数列
 */
public class Demo02 {

    public static void main(String[] args) {

        System.out.println(fibonacci(50));

    }

    public static int fibonacci(int n) {
        // 出口
        if (n == 1 || n == 2) {
            return 1;
        }
        // 规律
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
