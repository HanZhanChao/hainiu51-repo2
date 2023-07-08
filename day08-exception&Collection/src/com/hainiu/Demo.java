package com.hainiu;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author HaiNiu
 * @description 1、规范问题
 * 代码格式化良好
 * 标识符符合规范
 * 注释良好
 * <p>
 * 2、效率
 * <p>
 * 3、遇到通用的小功能，抽取方法实现 -- 封装
 */
public class Demo {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(arrayToString(arr));

    }

    public static String arrayToString(int[][] arr) {
        if (Objects.isNull(arr)) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; i < arr.length; i++) {
            int[] a = arr[i];
            if (a == null) {
                b.append("null");
            } else if (a.length == 0) {
                b.append("[]");
            } else {
                b.append("[");
                for (int j = 0; j < a.length; j++) {
                    b.append(a[j]);
                    if (j < a.length - 1) {
                        b.append(", ");
                    } else {
                        b.append("]");
                    }
                }
            }
            if (i < arr.length - 1) {
                b.append(", ");
            } else {
               b.append("]");
            }
        }
        return b.toString();
    }


}
