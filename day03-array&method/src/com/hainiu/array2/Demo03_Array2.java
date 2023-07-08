package com.hainiu.array2;

/**
 * @author HaiNiu
 * @description 遍历二维数组
 */
public class Demo03_Array2 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // 求和
        int sum = 0;

        // 外层循环获取的是每个一维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个一维数组元素如下：");
            int s = 0;
            // 内层循环遍历每个一维数组 得到数据
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.println(arr[i][j]);
                s += arr[i][j];
                // 累加
                sum += arr[i][j];
            }
            // 内循环遍历完一轮 一个小数组统计完毕
            System.out.println(s);
        }
        System.out.println(sum);
    }
}
