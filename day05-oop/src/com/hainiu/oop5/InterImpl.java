package com.hainiu.oop5;

/**
 * @author HaiNiu
 * @description 接口的多实现弥补了类单继承的局限性
 */
public class InterImpl extends Object implements Inter, User {

    public InterImpl() {
        super();
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void login() {
        System.out.println("登录");
    }
}
