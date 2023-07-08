package com.hainiu.apidemo1;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {
        // public Scanner(InputStream source) -- 标准 输入流
        Scanner sc = new Scanner(System.in);

        // public String nextLine() -- 获取输入的一整行数据  以换行符作为结束
        /*String s = sc.nextLine();
        System.out.println(s);*/

        // public String next() -- 获取一个完整的数据 不包含空字符
        /*String str = sc.next();
        System.out.println(str);*/

        // 注意：nextLine 和 nextInt() 连续使用有问题

        String s = sc.nextLine();
        System.out.println(s);

        int i = sc.nextInt();
        System.out.println(i);
    }

}
