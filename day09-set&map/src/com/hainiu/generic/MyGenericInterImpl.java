package com.hainiu.generic;

/**
 * @author HaiNiu
 * @description
 * 接口的子类明确数据类型
 */
public class MyGenericInterImpl implements MyGenericInter<String> {

    @Override
    public void show(String value) {
        System.out.println(value);
    }
}
