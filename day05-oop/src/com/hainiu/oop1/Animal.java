package com.hainiu.oop1;

/**
 * @author HaiNiu
 * @description 动物  本身就是抽象的概念 将来应该使用子类
 * 一般情况下，抽象类都是抽象一个体系的共性内容，作为父类
 */
public abstract class Animal {
    private String name;
    private String color;

    // 抽象类不能创建对象  构造方法作用：供子类访问的
    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 吃的方法  抽象方法  只有声明没有实现
    // 抽象方法只能在抽象类中
    public abstract void eat();
}
