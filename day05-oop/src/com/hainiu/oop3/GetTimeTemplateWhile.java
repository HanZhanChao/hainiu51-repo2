package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description
 */
public class GetTimeTemplateWhile extends GetTimeTemplate {

    @Override
    public void testCode() {
        int x = 1;
        while (x <= 1000000) {
            System.out.println(x++);
        }
    }
}
