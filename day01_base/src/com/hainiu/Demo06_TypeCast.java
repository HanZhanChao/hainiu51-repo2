package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Demo06_TypeCast {

    public static void main(String[] args) {

        int num1 = 10;
        double num2 = num1;
        System.out.println(num2); // 10.0 自动将int转换为double

        double num3 = 2.7;
        int num4 = (int) num3; // 强制类型转换
        System.out.println(num4); // 直接舍弃小数位

        byte b1 = 10;
        byte b2 = 20;
//        int b3 = b1 + b2;
        byte b4 = (byte) (b1 + b2);
//        System.out.println(b3);
        System.out.println(b4);

        byte x = (byte) 200;
        System.out.println(x); // -56 截取二进制补码

    }

}
