package com.hainiu.array1;

/**
 * @author HaiNiu
 * @description 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
 */
public class Demo02_Array {
    public static void main(String[] args) {
        // 静态初始化
        int[] arr = new int[]{11, 22, 33};
        // 简化书写
//        int[] arr = {11, 22, 33};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 通过length属性，获取到数组的长度  数组名.length
        System.out.println(arr.length);

//        System.out.println(arr[3]);

//        int[] arr2 = null; // 空值  null表示没有对象   所有引用数据类型的默认初始化值

//        String str = null;

        // null空对象不能调用任何属性和方法
      //  System.out.println(arr2.length); // NullPointerException  空指针异常
//        System.out.println(String.valueOf(100));

//        System.out.println(str.length());
    }
}
