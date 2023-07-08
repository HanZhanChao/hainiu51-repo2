package com.hainiu.oop11;

/**
 * @author HaiNiu
 * @description
 */
public class Test {

    public static void main(String[] args) {

        /*Rectangle r = new Rectangle();
        r.draw();*/

        // 创建对象和使用对象 解耦
        Shape shape = ShapeFactory.getShape("circle"); // 父接口接收子类对象
        shape.draw();

    }

}
