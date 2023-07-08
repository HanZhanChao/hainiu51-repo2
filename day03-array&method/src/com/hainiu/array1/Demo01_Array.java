package com.hainiu.array1;

/**
 * @author HaiNiu
 * @description
 *
 *数据类型[] 数组名 = new 数据类型[数组长度];
 */
public class Demo01_Array {

    public static void main(String[] args) {
        // 定义整数数组
        int[] arr = new int[3];
        /*
             int 表示数组中的元素数据类型
             [] 表示一维数组
             arr 数组名 -- 变量名
             new -- 创建对象（开辟内存空间，为对象初始化）
             [3] 表示的数组长度

            [I@1b6d3586
                 [ 表示数组
                 I Integer 整数
                 @ 固定的连接符
                 1b6d3586 十六进制整数 代表数组在内存中地址值

             存储整数
             默认初始化值:
                整数 0
                小数 0.0
                char '\u0000'
                boolean false
                引用：null
         */
        System.out.println(arr); // [I@1b6d3586
        System.out.println(arr[0]); // 数组名[索引]
        System.out.println(arr[1]); // 数组名[索引]
        System.out.println(arr[2]); // 数组名[索引]
        System.out.println("----------");
        // 赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // arr[3] = 4; // ArrayIndexOutOfBoundsException 数组索引越界异常
        // System.out.println(arr[3]);
    }
}
