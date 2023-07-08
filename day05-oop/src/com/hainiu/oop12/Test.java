package com.hainiu.oop12;

/**
 * @author HaiNiu
 * @description
 */
public class Test {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new RectangleFactory();

        Shape shape = shapeFactory.getShape();
        shape.draw();


        shapeFactory = new CircleFactory();
        Shape s = shapeFactory.getShape();
        s.draw();

    }

}
