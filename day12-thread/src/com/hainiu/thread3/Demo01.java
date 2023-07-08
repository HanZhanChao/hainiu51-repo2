package com.hainiu.thread3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) throws InterruptedException {

        // 开两条线程 往map集合存储数据

//        HashMap<String, String> hashMap = new HashMap<>();

        // 使用Collections工具类 将不同步的集合 转换为同步的集合
//        Map<String, String> map = Collections.synchronizedMap(hashMap);

        // 使用同步集合ConcurrentHashMap
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 50; i < 100; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(1000);

        // 遍历查看结果
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "===" + map.get(String.valueOf(i)));
        }

    }
}
