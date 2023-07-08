package com.hainiu.oop7;

/**
 * @author HaiNiu
 * @description
 */
public class Cat extends Pet {

    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        // 交给父类初始化
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
