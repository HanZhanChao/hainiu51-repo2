package com.hainiu;

import java.util.Collections;

/**
 * @author HaiNiu
 * @description 可变参数：针对参数类型相同 但个数不确定的情况
 */
public class Demo01_Parameter {

    public static void main(String[] args) {
        // 灵活的传递参数
        int s1 = add(1, 2);
        System.out.println(s1);

        int s2 = add(1);
        System.out.println(s2);

        int s3 = add(1, 2, 3, 4, 5);
        System.out.println(s3);

        // 传递0个
        int s4 = add();
        System.out.println(s4);

        // 传递null
        int s5 = add(null);
        System.out.println(s5);

        // 传递数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int s6 = add(arr);
        System.out.println(s6);

        // 注意：如果一个方法既有可变参数 也有其他参数，那么可变参数必须放在后面
    }

    // 可变参数 允许 0~n个
    public static int add(int... args) {
        // 本质：一个数组
        if (args == null) {
            return 0;
        }
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }

}
