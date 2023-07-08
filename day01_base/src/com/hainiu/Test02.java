package com.hainiu;

/**
 * @author HaiNiu
 * @description 超级素数
 * 超级素数是指一个素数，每去掉后面一个数字，总能保证剩下的数为质数，例如：
 * 373->37->3
 * 这是一个长为3的超级素数。
 * 将符合要求的7位数的素数都打印出来
 */
public class Test02 {

    public static void main(String[] args) {

        for (int num = 1000001; num < 9999999; num++) {
            int i = num;
            while (i > 10) {
                boolean isPrime = isPrime(i);
                if (isPrime) {
                    i = i / 10;
                } else {
                    break;
                }
            }
            if (i == 2 || i ==3 || i == 5 || i == 7) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // 从2开始除
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
