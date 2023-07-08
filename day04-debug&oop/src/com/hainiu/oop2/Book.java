package com.hainiu.oop2;

/**
 * @author HaiNiu
 * @description
 * 1、分析描述的事物有什么属性，一般都用private修饰
 * 2、提供相应的get和set方法
 *
 * alt + insert -- generate(生成代码)
 *
 */
public class Book {

    // 一个类 如果没有提供任何的构造方法 那么默认会有一个空参的构造
    /*public Book() {
        System.out.println("构造方法执行了");
    }

    // 在构建对象时，就给成员变量赋值
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }*/

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 书名
    private String title;
    // 作者
    private String author;
    // 价格
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
