package com.hainiu.recursion;

/**
 * @author HaiNiu
 * @description 最大公约数
 *
 * 24  1 2 3 4 6 8 12 24
 * 60  1 2 3 4 5 6 10 12 15 20 30 60
 *
 * 最小公倍数 = a * b / 最大公约数;  120
 */
public class Demo03 {

    public static void main(String[] args) {

        System.out.println(gcd(120 , 150));

    }

    // 最小公倍数
    public static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }


    // 动态规划
    public static int gcd(int x, int y) {
        if (x == y) {
            return x;
        }
        // 保证前面的大
        int a = Math.max(x, y);
        int b = Math.min(x, y);

        int r = a % b;
        while (r != 0) {
            // 下一次计算
            a = b;
            b = r;
            r = a % b;
        }
        return b; // 余数为0时 ，除数就是
    }

    /*// 递归
    public static int gcd(int x, int y) {
        // 如果相等
        if (x == y) {
            return x;
        }
        // 保证前面的大
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        // 取余
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            // 规律
            return gcd(b, r);
        }
    }*/
}
