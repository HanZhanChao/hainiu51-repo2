package com.hainiu.apidemo;

/**
 * @author HaiNiu
 * @description   StringBuilder构造方法和成员方法
 * StringBuilde的扩容机制
 * 1、使用空参构造创建对象，初始化了一个长度为16的字符数组 用于存入数据；目前的数据是空字符。
 * 2、添加数据时，如果已有字符长度 + 要添加到数据长度，不超过16，直接添加不扩容
 * 3、如果已有字符长度 + 要添加到数据长度超过默认容量16，扩容
 *      首先扩容至原来长度的2倍+2 ，然后判断这个新容量是否满足最小容量的需求
 *      如果满足，就使用这个新容量；
 *      如果不满足，就使用本次添加数据所需的最小容量作为新容量；
 *      再使用新容量创建数组，将原数组中的数据拷贝到新数组中
 *
 *  System.arraycopy 完成数组元素拷贝
 *
 */
public class Demo02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.capacity()); // 容量
        System.out.println("===========");

        /*builder.append("abc");// 追加数据 就是在当前对象后面追加 返回的还是这个对象
        builder.append(100);
        builder.append(2.5);
        builder.append(true);
        builder.append(new Object());*/

        builder.append("abc").append(100).append(2.5).append(true);
        System.out.println(builder);
        // 链式编程 如果对象调用方法 返回了对象，那么可以在调用方法的后面继续打点调用返回对象的方法

        System.out.println(builder);

        System.out.println("===========");
        StringBuilder builder1 = new StringBuilder("hello");
        System.out.println(builder1);
        System.out.println(builder1.length());
        System.out.println(builder1.capacity());

        // 在指定的位置插入
        builder1.insert(1, "java");
        System.out.println(builder1);

        int[] arr = {1, 2, 3, 4};
        String s = arrayToString(arr);
        System.out.println(s);
    }


    public static String arrayToString(int[] arr) {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i < arr.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
