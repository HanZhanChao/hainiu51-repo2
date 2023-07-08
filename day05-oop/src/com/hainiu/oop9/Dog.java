package com.hainiu.oop9;

/**
 * @author HaiNiu
 * @description
 */
public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void play() {
        System.out.println("玩游戏");
    }

}
