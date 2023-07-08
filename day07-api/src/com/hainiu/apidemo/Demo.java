package com.hainiu.apidemo;

import java.math.BigDecimal;

/**
 * @author HaiNiu
 * @description 封装
 */
public class Demo {

    // double的精确加法
    public static double add(double x, double y) {
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        return a.add(b).doubleValue();
    }

    // 减法

    // 乘法

    // 除法
}
