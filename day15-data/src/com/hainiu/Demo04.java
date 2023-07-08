package com.hainiu;

import java.util.Random;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04 {
    public static void main(String[] args) {

        Account account = new Account();

        new Thread(account, "甲").start();
        new Thread(account, "乙").start();

    }
}
