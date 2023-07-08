package com.hainiu;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressingFeature;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author HaiNiu
 * @description
 * LinkedList<String> list = new LinkedList<>();
 * list.add("及时雨宋江");
 * list.add("玉麒麟卢俊义");
 * list.add("智多星吴用");
 * list.add("入云龙公孙胜");
 * list.add("大刀关胜");
 * list.add("豹子头林冲");
 * list.add("霹雳火秦明");
 * list.add("双鞭呼延灼");
 * list.add("小李广花荣");
 * list.add("小旋风柴进");
 * list.add("扑天雕李应");
 * list.add("美髯公朱仝");
 * list.add("花和尚鲁智深");
 * list.add("行者武松");
 */
public class Demo04 {

    static Object obj = new Object();

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");

        // 多态
        Runnable r = () -> {
            while (true) {
                // 多线程对共享数据作出修改 同步
                synchronized (obj) {
                    if (list.size() == 0) {
                        break;
                    }
                    String s = list.removeFirst();
                    System.out.println(Thread.currentThread().getName() + "获得英雄：" + s);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(r, "线程A").start();
        new Thread(r, "线程B").start();
        new Thread(r, "线程C").start();
    }
}
