package com.hainiu;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {


    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(1000);
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int num = quickSelect(arr, 5);
        System.out.println(num);

    }



    public static int quickSelect(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {
        int pivot = partition(nums, left, right);
        if (pivot == k - 1) {
            return nums[pivot];
        } else if (pivot > k - 1) {
            return quickSelect(nums, left, pivot - 1, k);
        } else {
            return quickSelect(nums, pivot + 1, right, k);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] >= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


