package com.hainiu.debug;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02_Argument {
    /*public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number); // 100
        change(number); // 调用方法
        System.out.println("调用change方法后：" + number); // 100
    }

    public static void change(int number) {
        number = 200;
        System.out.println("change方法中：" + number); // 200
    }*/

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]); // 20
        change(arr);
        System.out.println("调用change方法后：" + arr[1]); // 200
    }

    public static void change(int[] arr) {
        arr[1] = 200;
        System.out.println("调用change方法后：" + arr[1]); // 200
    }

}
