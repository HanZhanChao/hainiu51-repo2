package com.hainiu.oop6;

/**
 * @author HaiNiu
 * @description
 */
public class Zi extends Fu {

    public void hi() {
        System.out.println("Zi...hi");
    }

    @Override // 检测当前方法是否是重写父类的方法   注解
    // 子类也需要这个功能  但是有不同的实现  子类就可以重写   覆盖  覆写
    public void world() { // 方法的返回值 参数列表 方法名都与父类相同
        // 重写时 如果还想调用父类的方法
        super.world();
        System.out.println("Zi...world");
    }
}
