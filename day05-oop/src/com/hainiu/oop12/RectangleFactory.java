package com.hainiu.oop12;

/**
 * @author HaiNiu
 * @description 创建矩形的工厂
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
