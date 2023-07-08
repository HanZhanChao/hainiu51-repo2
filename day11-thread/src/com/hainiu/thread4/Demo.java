package com.hainiu.thread4;


/**
 * @author HaiNiu
 * @description
 *
 * 现场安全问题的出现场景：
 * 多线程环境操作共享数据，作出修改。
 *
 */
public class Demo {
    public static void main(String[] args) {

        // 开两个窗口
        MyTicket ticket = new MyTicket();

        // 两条线程执行相同的任务
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();

    }
}
