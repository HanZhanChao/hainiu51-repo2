package com.hainiu.oop5;

/**
 * @author HaiNiu
 * @description
 *
 * interface 定义一个接口
 * 接口的源代码也是java文件  编译后也是class文件
 *
 *  构造器 -- 没有
 *  成员变量 -- 接口中的成员变量，只能是常量 默认修饰符 public static final
 *  成员方法 -- 只能是抽象方法，默认修饰符 public abstract
 *
 *  接口就是用来体现规则
 *
 *  抽象方法用abstract修饰，那么这个修饰符是否可以与以下的修饰符共用？
 *      private -- 私有修饰其他任何类无法使用 何谈重写
 *      static -- 静态修饰可以使用类名或者接口名直接打点调用，调用抽象方法没有意义
 *      final -- final修饰的方法子类无法重写
 *      protected -- 子类使用 其他人访问不了
 *
 */
public interface Inter {

//   public static final int X = 10;

    void a();
    void b();
    public abstract void c();
}
