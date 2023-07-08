package com.hainiu;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 */
public class quickSork {

    public static void main(String[] args) {
        int[] arr ={21,32,23,14,35,45,11};
        System.out.println(Arrays.toString(arr));
        quickSork(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSork(int [] arr, int left,int right){
        if (left > right) {
            return;
        }
        int i,j,pivot;
        i = left;
        j = right;
        pivot = arr[left];
        while (i < j){
             while (arr[j] >= pivot && i < j){
                 j--;
             }
             while (arr[i] <= pivot && i <j){
                 i++;
             }
             if(i < j){
                 int t = arr[i];
                 arr[i] = arr[right];
                 arr[right] = t;
             }
             arr[left] = arr[i];
             arr[i] = pivot;
             quickSork(arr,left,i -1);
             quickSork(arr,i + 1,right);
        }
    }
}
