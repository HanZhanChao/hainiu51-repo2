package com.hainiuxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author HaiNiu
 * @description 测试Demo类的  包的结构与源码包下 Demo类相同
 */
public class DemoTest {


    // 测试方法 必须是 无参数 无返回值 public 修饰 非静态的
    @Test
    public void test() {
        Demo demo = new Demo();
        String name = demo.getNameById("hainiu001");
        // 断言
        Assert.assertEquals("Tom", name);
    }

}
