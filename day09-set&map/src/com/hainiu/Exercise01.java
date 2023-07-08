package com.hainiu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Exercise01 {

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

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        Integer year = Integer.parseInt(sc.nextLine());
        if (map.containsKey(year)) {
            System.out.println(year + "年的世界杯冠军是：" + map.get(year));
        } else {
            System.out.println(year + "年没有举办世界杯");
        }

        System.out.println("请输入国家：");
        String country = sc.nextLine();
        if (map.containsValue(country)) {
            System.out.println(country + "获得冠军的年份为：");
            map.forEach((k, v) -> {
                if (country.equals(v)) {
                    System.out.println(k);
                }
            });
        } else {
            System.out.println(country + "没有获得过世界杯冠军");
        }

    }
}
