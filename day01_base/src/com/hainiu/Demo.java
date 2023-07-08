package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        int[] a = new int[]{14,11,31,10};
        int[] b = new int[]{31,11,11,31};
        System.out.println(Q(a));
        System.out.println(Q(b));


    }
    public static int Q(int[] a){
        int[] arr = new int[a.length];
        arr[0] = a[0];
        arr[1] = Math.max(a[0] , a[1]);
        if(a.length == 1){
            return a[0];
        }
        if(a.length == 2){
            return Math.max(a[0] , a[1]);
        }
        if(a.length >= 3){
            for (int i = 2; i < a.length; i++) {
                arr[i] = Math.max(arr[i - 2] + a[i] ,arr[i - 1]);
            }
        }
        return arr[arr.length - 1];
    }

}
