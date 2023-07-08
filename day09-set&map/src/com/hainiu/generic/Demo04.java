package com.hainiu.generic;

import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description 泛型的通配符
 */
public class Demo04 {


    public static void main(String[] args) {
        /*
        ArrayList<Father> list1 = new ArrayList<>();
        testBounds(list1);

        ArrayList<Son> list2 = new ArrayList<>();
        testBounds(list2);

        ArrayList<Daughter> list3 = new ArrayList<>();
        testBounds(list3);

        ArrayList<Mother> list4 = new ArrayList<>();
//        testBounds(list4);
         */
    }


    // 泛型方法  Father和 Father的子类型
    public static <T> void testBounds(ArrayList<? extends Father> list) {

    }
}

/*
class Father {}

class Son extends Father {}

class Daughter extends Father {}

class Mother {}*/
