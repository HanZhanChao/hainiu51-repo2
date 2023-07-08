package com.hainiu.generic;

import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 *
 * <? super E>有**下限**的通配符。能接受**指定类及其父类类型**的数据，E就是该泛型的下边界
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Father> list1 = new ArrayList<>();
        testBounds(list1);

        ArrayList<GrandFather> list2 = new ArrayList<>();
        testBounds(list2);

        ArrayList<Son> list3 = new ArrayList<>();
        // 代码报错 因为Son类是Father的子类
//        testBounds(list3);
    }

    // 泛型方法
    public static <T> void testBounds(ArrayList<? super Father> list) {

    }
}


class GrandFather { }

class Father extends GrandFather { }

class Son extends Father { }