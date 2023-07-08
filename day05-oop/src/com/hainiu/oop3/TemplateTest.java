package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description 获取程序的执行时间
 * <p>
 * System.currentTimeMillis() -- 获取当前系统时间距离1970-1-1 0:0:0 毫秒值
 * <p>
 * 1、获取开始时间
 * 2、执行测试代码
 * 3、获取结束时间
 * 4、取时间差
 * <p>
 * 模板方法模式：在父类中定义一个算法的骨架，而将算法中的某一步或者多步延迟到子类实现，
 * 使得子类在不改变算法结构的基础上可以灵活定义其中的一步或多步。
 * <p>
 * 开闭原则：对扩展开放 对修改关闭
 */
public class TemplateTest {

    public static void main(String[] args) {

        GetTimeTemplateFor gttf = new GetTimeTemplateFor();
        long time = gttf.getTime();
        System.out.println(time);

        /*
        GetTimeTemplateWhile gttw = new GetTimeTemplateWhile();
        System.out.println(gttw.getTime());
        */
    }
}
