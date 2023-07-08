package com.hainiu.apidemo;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 */
public class Demo08_System {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 错误流
            System.err.println(111);
            System.out.println(222);
        }
        // public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        System.arraycopy(arr1, 2, arr2, 0, 3);

        System.out.println(Arrays.toString(arr2));

        // public static void exit(int status)
        System.exit(0);

       /* StringBuilder builder = new StringBuilder();
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        builder.append("hello");
        System.out.println(builder.length());
        System.out.println(builder.capacity());

        builder.append("012345678901234567890123456789");

        System.out.println(builder.length());
        System.out.println(builder.capacity());*/


    }
}
