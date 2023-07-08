package com.hainiu.oop7;

/**
 * @author HaiNiu
 * @description
 */
public class Dog extends Pet implements Jump {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println(getName() + "小狗送去学跳高");
    }
}
