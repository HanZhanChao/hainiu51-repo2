package com.hainiu.method;

/**
 * @author HaiNiu
 * @description
 * 请定义方法实现，将整数数组中的数据打印到控制台
 * 参数：int[] arr
 * 返回值：没有
 */
public class Demo03_Method {
    public static void main(String[] args) {
        // 调用
        int[] arr = {11, 22, 33, 44};
        printArray(arr);

        int[] arr2 = {21, 32, 43};
        printArray(arr2);

    }

    // 定义方法打印数组
    public static void printArray(int[] arr) {
        // 打印前面的数据都不换行
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // 判断是否是最后一个元素
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        // 打印最终的右半个] 之后换行
        System.out.println("]");
    }

}
