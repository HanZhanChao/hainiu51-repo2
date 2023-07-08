package com.hainiu.oop11;

/**
 * @author HaiNiu
 * @description  创建对象的动作放到工厂中
 */
public class ShapeFactory {

    // 方法的返回值是接口 返回的一定是实现了接口的子类对象  多态
    public static Shape getShape(String name) {
        if ("rectangle".equals(name)) {
            return new Rectangle();
        } else if ("circle".equals(name)) {
            return new Circle();
        } else if ("square".equals(name)) {
            return new Square();
        }
        return null;
    }
}
