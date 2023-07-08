package com.hainiu.oop2;

import com.hainiu.oop1.Animal;
import com.hainiu.oop1.Cat;

import java.util.Date;
import static java.lang.System.out;
/**
 * @author HaiNiu
 * @description
 *
 * 用final修饰的变量 是常量，命名规范 所有字母大写，如果有多个单词中间用_隔开
 */
public class DemoZi extends Demo {

    public static void main(String[] args) {

        final int x = 10;
        out.println(x);
        /*
        x = 20;
        System.out.println(x);
        */

        final Cat cat = new Cat("Tom", "blue");

      //  cat = new Cat("加菲", "棕色");
        cat.setName("加菲");

        cat.eat();

        Date d1 = new Date();
        java.sql.Date d2 = new java.sql.Date(231242343L);

    }
}
