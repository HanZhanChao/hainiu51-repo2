package com.hainiu.exception;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {

        double a = divide(10, 3, 5);
        System.out.println(a);

        // ctrl + alt + t

        double b = 0;
        try {
            b = divide(10, 3, -5);
        } catch (IllegalArgumentException e) {
            /*String message = e.getMessage();
            System.out.println(message);*/ // 异常的消息字符串 -- 创建异常对象时传递的参数信息

            // System.out.println(e.toString()); // Throwable类重写了toString方法，把异常名称和异常信息转换为字符串

            e.printStackTrace(); // 使用错误流 将异常名称 + 异常信息 + 异常位置打印到控制台

            // 日志技术将信息输出到日志中。

        }
        System.out.println(b);

    }

    /**
     * a / b 的精确运算 指定保留的小数位数scale
     * @param a
     * @param b
     * @param scale
     * @return
     */
    public static double divide(double a, double b, int scale) {

        // scale = -1
        if (scale < 0) {
            // 由于参数的错误 造成后续代码无法执行了，而且也无法通过返回值告知调用者，抛出一个异常对象
            IllegalArgumentException e = new IllegalArgumentException("保留的小数位数scale不能为负数");
            throw e;
        }

        BigDecimal x = new BigDecimal(String.valueOf(a));
        BigDecimal y = new BigDecimal(String.valueOf(b));

        BigDecimal z = x.divide(y, scale, RoundingMode.HALF_UP);

        return z.doubleValue();
    }

}
