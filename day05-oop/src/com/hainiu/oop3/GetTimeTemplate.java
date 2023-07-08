package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description 测试程序执行时间的模板
 */
public abstract class GetTimeTemplate {

    // 获取程序执行时间
    // 这个方法要求子类不能重写
    public final long getTime() {
//      1、获取开始时间
        long start = System.currentTimeMillis();
//      2、执行测试代码
        testCode();
//      3、获取结束时间
        long end = System.currentTimeMillis();
//      4、取时间差
        return end - start;
    }

    public abstract void testCode();

}
