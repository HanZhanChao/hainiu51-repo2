package com.hainiu;

/**
 * @author HaiNiu
 * @description 素数也称质数，是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 *
 */
public class Exercise01 {
    public static void main(String[] args) {
        // 获取一千以内所有的素数
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    /**
     * 判断参数是否为素数
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        // 如果不与6的倍数相邻，不是素数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        // 对6倍邻数进行判断，是否为6倍邻数的倍数
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
