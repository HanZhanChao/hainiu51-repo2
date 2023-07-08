package com.hainiu.apidemo;


import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author HaiNiu
 * @description
 */
public class Demo07_BigDecimal {

    public static void main(String[] args) {

       /* double a = 1.1;
        double b = 0.8;
        System.out.println(a + b);*/

        BigDecimal a = new BigDecimal(String.valueOf(1.1));
        BigDecimal b = new BigDecimal(String.valueOf(0.8));

        BigDecimal c = a.add(b);
        // 转
        double d = c.doubleValue();
        System.out.println(d);

        // 除数  除不尽时保留的小数位数   舍入模式
        BigDecimal e = a.divide(b, 5, RoundingMode.HALF_UP);
        System.out.println(e);
    }

}
