package com.hainiu;

/**
 * @author HaiNiu
 * @description
 *
 * 3070
 * 1535  1534
 * 767   766
 * 383   382
 * 191   190
 * 95    94
 * 47    46
 * 23    22
 * 11    10
 * 5     4
 * 2     1
 * 1
 */
public class Exercise03 {
    public static void main(String[] args) {
        // 第10天数量
        int num = 1;
        // 循环
        int day = 10;
        while (day >= 1) {
            // 前一天的数量
            num = (num + 1) * 2;
            day--;
        }
        System.out.println(num);
    }

    /**
     * 计算m和n的最小公倍数，最小公倍数 = m * n / 最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }

    /**
     * 计算m和n的最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int gcd(int m, int n) {
        if (m == n) {
            return m;
        }
        // 被除数
        int dividend = m > n ? m : n;
        // 除数
        int divisor = m > n ? n : m;
        // 余数
        int remainder = dividend % divisor;
        while (remainder != 0){
            // 下一次 被除数=除法
            dividend = divisor;
            // 下一次 除数=余数
            divisor = remainder;
            remainder = dividend % divisor;
        }
        // 当余数为0时，当前除数就是
        return divisor;
    }
}
