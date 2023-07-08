package com.hainiu.apidemo;

/**
 * @author HaiNiu
 * @description   int[] arr = {1, 2, 3, 4};
 * 对于字符串的不可变，优点是共享，缺点是如果涉及到字符串的多次改变，在内存中产生过多的垃圾
 *
 * 所以 涉及到频繁改变字符串的场景 用 StringBuilder 字符串构建器
 */
public class Demo01_StringBuilder {
    public static void main(String[] args) {

    }

    public static String arrayToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
