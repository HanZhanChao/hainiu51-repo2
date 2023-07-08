package com.hainiu;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 如果我们不使用额外的数组，只是在原数组上进行操作呢？
 *
 * 此时，我们就可以采用快慢指针的思想：初始化一个快指针 fast 和一个慢指针 slow，
 * fast 每次移动一步，而 slow 只当 fast 指向的值不等于 val 时才移动一步。
 *
 */
public class Test01 {

    public static void main(String[] args) {


        int[] nums = {2, 2, 1, 2, 2, 3, 4, 2, 2, 2, 5, 2, 6};

        int val = 2;

        // 慢指针 -- 非删除的元素 要存入的新位置 -- 遇到一个非删除的元素才移动一步
        int j = 0;
        // 快指针 每次移动一步 -- 判断所有的元素
        for (int i = 0; i < nums.length; i++) {
            // 如果不是要删除的值
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }

        /*for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }*/

        System.out.println(j);

        for (int i = 0; i < j; i++) {
            System.out.println(nums[i]);
        }

        System.out.println(Arrays.toString(nums));

    }
}
