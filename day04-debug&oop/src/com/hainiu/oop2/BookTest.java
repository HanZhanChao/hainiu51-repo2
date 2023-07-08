package com.hainiu.oop2;

/**
 * @author HaiNiu
 * @description
 *
 * 一个类包含三种成员
 *  属性 -- 成员变量     字段 field
 *  行为 -- 成员方法      method
 *  构造方法（构造器） -- 如何创建对象 -- new关键字后面的就是在调用构造方法   Constructor
 *
 *
 */
public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());

        Book b2 = new Book("金瓶梅", "兰陵笑笑生", 88.8);
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getPrice());

    }
}
