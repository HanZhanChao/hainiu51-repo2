package com.hainiu.oop7;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Zichuuang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        selectZICHUANG(s);

    }
   public static int selectZICHUANG(String s){
        int index=0;
        int[] a=new  int[s.length()];
        while(index<a.length){
            String s1="";
            String s2="";
            for (int i = index; i <s.length() ; i++) {
                s1+=s.charAt(i);
                int m=s1.length()-1;
                int a1=s1.indexOf(s1.charAt(m));
                int a2=s2.lastIndexOf(s1.charAt(m));
                if(a1!=a2){
                    s2=s1.substring(0,s1.length()-1);
                    break;
                }
                s2=s1;
            }
            index++;
            a[index]=s2.length();

        }
        int sum=0;
       for (int i = 0; i < a.length; i++) {
           if(sum<a[i]){
               sum=a[i];
       }
       }
      return sum;
   }
}
