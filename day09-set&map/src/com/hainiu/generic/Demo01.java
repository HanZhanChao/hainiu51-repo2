package com.hainiu.generic;

import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        /*list.add(100);
        list.add(2.5);*/

        for (String s : list) {

        }

        for(Object o : list) {
            String s = (String) o; // ClassCastException
            System.out.println(s.length());
        }
    }

}
