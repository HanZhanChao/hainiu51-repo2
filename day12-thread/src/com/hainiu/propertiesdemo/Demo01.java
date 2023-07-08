package com.hainiu.propertiesdemo;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 *
 * Properties类表示一组持久的属性。 作为map集合的使用
 *
 * 属性列表中的每个键及其对应的值都是一个字符串。
 *
 */
public class Demo01 {
    public static void main(String[] args) {

        Properties properties = new Properties();
        // 添加元素
        properties.setProperty("111", "222");
        properties.setProperty("333", "444");
        properties.setProperty("555", "666");
        properties.setProperty("333", "777");

        // 通过键获取值
        String v1 = properties.getProperty("333");
        System.out.println(v1);

        // 通过键获取值 如果没有对应的键 返回第二个参数作为默认值
        String v2 = properties.getProperty("222", "888");
        System.out.println(v2);

        System.out.println("---------");

        Enumeration<String> propertyNames = (Enumeration<String>) properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String key = propertyNames.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }

    private static void method1() {
        Properties properties = new Properties();

        // 添加元素
        properties.put("张三", "李四");
        properties.put("王五", "赵六");
        properties.put("Tom", "Jerry");

        // 遍历
        for (Object key : properties.keySet()) {
            Object value = properties.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
