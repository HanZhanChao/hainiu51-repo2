package com.hainiu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author HaiNiu
 * @description Collections 操作集合的工具类
 * <p>
 * public static void shuffle(List<?> list)
 * 随机置换
 * <p>
 * ctrl + alt + m 选中的代码抽取成方法
 */
public class Test {

    public static void main(String[] args) {

        // 斗地主的发牌

        // 准备牌
        String[] color = {"♠", "♥", "♣", "◆"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> list = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                list.add(n + c);
            }
        }
        list.add("大王");
        list.add("小王");

        // 洗牌
        Collections.shuffle(list);

        // 三家
        ArrayList<String> gaoJin = new ArrayList<>();
        ArrayList<String> longWu = new ArrayList<>();
        ArrayList<String> me = new ArrayList<>();

        // 轮流发牌 -- 留三张底牌
        int di = 3;
        for (int i = 0; i < list.size() - di; i++) {
            String s = list.get(i);
            if (i % 3 == 0) {
                gaoJin.add(s);
            } else if (i % 3 == 1) {
                longWu.add(s);
            } else {
                me.add(s);
            }
        }
        System.out.println("三家的牌是：");
        System.out.print("高进的牌是：");
        printList(gaoJin);
        System.out.print("龙五的牌是：");
        printList(longWu);
        System.out.print("我的牌是：");
        printList(me);

        //底牌
        System.out.println("底牌：");
        for (int i = list.size() - 1; i >= list.size() - di; i--) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

    }

    private static void printList(ArrayList<String> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i < list.size() - 1) {
                System.out.print(s + "\t");
            } else {
                System.out.println(s);
            }
        }
    }



    private static void test() {
        ArrayList<String> list = new ArrayList<>();

        // 添加多个元素
        Collections.addAll(list, "hello", "world", "java", "mysql", "linux", "oracle", "windows", "mysql");

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }

}
