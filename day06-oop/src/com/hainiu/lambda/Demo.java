package com.hainiu.lambda;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 *
 * (形式参数) -> {代码块}
 * (形式参数) -- 重写父接口中的抽象方法的参数列表
 * -> 箭头
 * {代码块} -- 如果重写父接口中的抽象方法的方法体
 *
 * Lambda 只针对函数式接口编程
 *  函数式接口 有且仅有一个抽象方法的接口
 *
 *
 */
public class Demo {

    public static void main(String[] args) {

        // 匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃包子");
            }
        });

        // lambda
        useEatable(() -> System.out.println("吃苹果"));

        // 匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "我们去放风筝");
            }
        });
        // lambda
        useFlyable(s -> System.out.println(s + "我们去跳楼吧"));

        // 匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                System.out.println(x);
                System.out.println(y);
                return x + y;
            }
        });
        // lambda
        useAddable((x, y) -> x + y);


        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.forEach(s -> System.out.println(s));

    }

    // 执行参数是接口的方法
    private static void useEatable(Eatable e) {
        e.eat();
    }

    // 方法的参数是接口 -- 传递的是接口的实现子类对象
    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里 ");
    }


    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

}
