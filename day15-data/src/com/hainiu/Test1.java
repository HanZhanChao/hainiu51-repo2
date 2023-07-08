package com.hainiu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> name = new HashSet<>();
        name.add("ak");
        name.add("m4a1");
        name.add("skr");
        System.out.println("请输入此次携带违禁品的人数");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            String name1 = scanner.next();
            if (name.contains(name1)) {
                count++;
            }
        }
        System.out.println(count);

    }

}
