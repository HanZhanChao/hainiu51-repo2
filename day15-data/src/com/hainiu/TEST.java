package com.hainiu;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class TEST {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入需要检测的范围");
        int x =sc.nextInt();
        System.out.println("请选择输入需要检测的数字");
        int y =sc.nextInt();
        int count =0;
        for (int i = 1; i <=x; i++) {
            int  z = i;
            while (true){
                if(z%10 == y){
                   count++;
                }
                z = z/10;
                if(z<= 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
