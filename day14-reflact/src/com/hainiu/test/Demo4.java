package com.hainiu.test;

/**
 * @author HaiNiu
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
           int[] a={1,4,59,5,6};
        int[] ints = countSort2(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
    public  static int[] countSort2(int[] A) {
        // 找出数组A中的最大值、最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // 初始化计数数组count
        // 长度为最大值减最小值加1
        int[] count = new int[max-min+1];
        // 对计数数组各元素赋值
        for (int num : A) {
            // A中的元素要减去最小值，再作为新索引
            count[num-min]++;
        }
        // 创建结果数组
        int[] result = new int[A.length];
        // 创建结果数组的起始索引
        int index = 0;
        // 遍历计数数组，将计数数组的索引填充到结果数组中
        for (int i=0; i<count.length; i++) {
            while (count[i]>0) {
                // 再将减去的最小值补上
                result[index++] = i+min;
                count[i]--;
            }
        }
        // 返回结果数组
        return result;
    }

}
