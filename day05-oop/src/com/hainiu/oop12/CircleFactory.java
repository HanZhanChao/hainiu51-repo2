package com.hainiu.oop12;

/**
 * @author HaiNiu
 * @description
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
