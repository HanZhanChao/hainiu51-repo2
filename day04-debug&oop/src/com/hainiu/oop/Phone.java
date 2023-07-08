package com.hainiu.oop;

/**
 * @author HaiNiu
 * @description
 *
 * this 代表当前类对象的引用
 *      this就代表来调用方法的这个对象
 *      this隐含在每一个非static的方法
 *  区分局部变量和成员变量
 *
 *  封装：隐藏属性及其实现细节，仅对外提供公共的访问方式。
 */
public class Phone {

    String brand;
    private int price;


    // 提供两个成员方法
    // 给成员变量赋值
    public void setPrice(int price) { // 变量的使用遵循 就近原则
        System.out.println(this);
        // 使用参数给成员变量赋值
        // 对参数作出判断
        if (price < 0) {
            System.out.println("价格不合理，无法赋值");
        } else {
//            price = price; // 使用局部变量给自己赋值 没有意义
            this.price = price; // 使用局部变量给成员变量赋值
        }
    }

    // 获取成员变量的值
    public int getPrice() {
        // 返回成员变量的值
        return price;
    }

    public void call(String name) {
        System.out.println(price);
        System.out.println("给" + name + "打电话");
    }


}
