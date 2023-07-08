package com.hainiu.debug;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_Debug {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);

        int k = add(x, y);
        System.out.println(k);

    }

    public static int add(int x, int y) {
        return x + y;
    }
}
