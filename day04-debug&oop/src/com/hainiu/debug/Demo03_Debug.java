package com.hainiu.debug;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03_Debug {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
