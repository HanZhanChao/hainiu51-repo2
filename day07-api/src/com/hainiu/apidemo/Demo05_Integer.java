package com.hainiu.apidemo;

/**
 * @author HaiNiu
 * @description
 */
public class Demo05_Integer {

    public static void main(String[] args) {

        Integer i1 = new Integer(100);

        Integer i2 = new Integer("200");

        System.out.println(i1);
        System.out.println(i2);

        // 自动装箱
        Integer x = 100;
        // 等效代码  Integer x = new Integer(100);
        // public static Integer valueOf(int i) -- Integer x = Integer.valueOf(100);

        // 自动拆箱
        x = x + 200; // Integer.valueOf(x.intValue() + 200)
        System.out.println(x);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String s = Integer.toBinaryString(-100); // 二进制补码
        System.out.println(s);

        // 将字符串解析成整数  public static int parseInt(String s)
        int i = Integer.parseInt("123");
        System.out.println(i);

        // int -- String
        String str = String.valueOf(100);
        System.out.println(str);


    }

}
