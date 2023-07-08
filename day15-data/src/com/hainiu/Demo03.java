package com.hainiu;

import java.util.HashMap;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();


        map.put("Tom", "java");
        map.put("Jerry", "mysql");
        map.put("Lucy", "hadoop");
        map.put("Lily", "oracle");
        map.put("Jack", "linux");
        map.put("Rose", "oracle");
        map.put("John", "oracle");

        map.forEach((k , v) -> {
            // 键 判断
            if (k.startsWith("J")) {
                System.out.println(k + "=" + v);
            }
        });

        map.forEach((k , v) -> {
            if ("oracle".equals(v)) {
                System.out.println(k);
            }
        });
    }

}
