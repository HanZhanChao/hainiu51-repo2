package com.hainiu.oop12;

/**
 * @author HaiNiu
 * @description
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}
