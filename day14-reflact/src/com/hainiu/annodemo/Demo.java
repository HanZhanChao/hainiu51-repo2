package com.hainiu.annodemo;

import java.lang.annotation.Target;
import java.util.Date;

/**
 * @author HaiNiu
 * @description
 */


//@Test(author="hainiu", date="2018-12-12", version = 5)
@Test(value = {"abc"})
public class Demo {

    @Test(value = {"abc"})
    public static void main( String[] args) {

        @Test(value = {"abc"})
        Date date = new Date();
        System.out.println(date.getYear());
    }
}
