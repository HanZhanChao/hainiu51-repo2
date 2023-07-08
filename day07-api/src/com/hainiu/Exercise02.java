package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Exercise02 {
    public static void main(String[] args) {
        long num = febonacci(30);
        System.out.println(num);
    }

    /**
     * 计算斐波那契数列的第n项
     *
     * @param n 第n项
     * @return 第n项的值
     */
    public static long febonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        // 前两项已知 都是1
        if (n == 1 || n == 2) {
            return 1;
        }
        // 使用数组存储数列的每一项
        long[] arr = new long[n];
        arr[0] = 1L;
        arr[1] = 1L;
        // 从第三项开始，当前项等于前两项的和
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        // 返回数组的最后一项
        return arr[n - 1];
    }
}
