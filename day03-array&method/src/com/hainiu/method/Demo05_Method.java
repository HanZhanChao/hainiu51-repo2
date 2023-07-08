package com.hainiu.method;

/**
 * @author HaiNiu
 * @description 请定义方法实现，获取整数数组中的数据的最大值。
 * 参数列表：int[] arr
 * 返回值：int
 */
public class Demo05_Method {
    public static void main(String[] args) {
        // 调用有返回值的方法
        int[] arr = {1, 6, 9, 8, 2, 3, 7, 4, 5};
        int max = getMax(arr); // 方法的返回值赋值给变量
        System.out.println(max);

        System.out.println(getMax(arr)); // 直接打印方法的返回值
    }


    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 方法有具体的返回值 return不可省略
        return max;
    }
}
