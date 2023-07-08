package com.hainiu;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 sdf
 sdf
 */
public class Demo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "苏格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        map.put(2018, "法国");
        map.put(2022, "阿根廷");

        /*for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }*/

       /* for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/

        // 录入年份 冠军国家
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入世界杯的举办年份：");
        Integer year = Integer.valueOf(sc.nextLine());
        String country = map.get(year);
        // 如果键不存在，获取到的是null
        if (Objects.isNull(country)) {
            System.out.println(year + "年没有举办世界杯");
        } else {
            System.out.println(year + "年的冠军国家是" + country);
        }
        System.out.println("----------");

        System.out.println("请输入国家名称：");
        String nation = sc.nextLine();

        // 标识
        boolean flag = false; // 默认存在

        // 遍历map 集合
        /*map.forEach((k, v) -> {
            // 判断值是不是录入的参数
            if (nation.equals(v)) {
                System.out.println(nation + "获得冠军的年份是：");
                flag = true; // 有
                System.out.println(k);
            }
        });*/

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            if (nation.equals(value)) {
                System.out.println(nation + "获得冠军的年份是：");
                flag = true; // 有
                System.out.println(key);
            }
        }

        if (!flag) {
            System.out.println(nation + "没有获得过世界杯冠军");
        }
    }

}
