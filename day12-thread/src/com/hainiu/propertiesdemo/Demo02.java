package com.hainiu.propertiesdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 * Properties可以保存到流中或从流中加载。
 *
 *
 * 保存到流中:
 *
 * 从流中加载：
 */
public class Demo02 {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        // 数据从配置文件读取
        FileInputStream in = new FileInputStream("day12-thread\\a.properties");
        properties.load(in);

        in.close();
        // 遍历
        properties.forEach((k ,v) -> System.out.println(k + "=" + v));

    }

    private static void method() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("name", "Tom");
        properties.setProperty("age", "23");
        properties.setProperty("address", "beijing");

        // 保存到流中 -- 将集合中的数据保存到输出流 -- 输出流指向文件
        FileOutputStream out = new FileOutputStream("day12-thread\\a.properties");
        // 注释信息用英文
        properties.store(out, "this is a student message");

        // .properties配置文件中的配置信息是以 属性名=属性值 的方式书写的
        out.close();
    }
}
