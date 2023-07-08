package com.hainiu.thread4;

/**
 * @author HaiNiu
 * @description 模拟多个窗口售出同一个场次的100张票。
 *
 * 1、重复票
 * 2、0和负数票
 *
 */
public class MyTicket implements Runnable {

    // 票定义在成员变量 -- 为了保证同一个资源
    private int ticket = 100;

    @Override
    public void run() {

        // 卖票
        while (true) {

            // 把对票的判断和-- 锁起来
            synchronized (this) { // 可以是任意对象 -- 但是，保证多条线程使用的是同一把锁
                // 针对最后一张票，当某条线程抢到资源时，判断通过，而在这条线程操作数据的过程中，被其他线程抢走资源，
                // 那么此时多条线程对最后一张票 做多次--操作，就会出现0 和 负数
                if (ticket <= 0) {
                    break;
                }
                // 售出一张
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                // 模拟一下出票的时间
                try {
                    Thread.sleep(10); // 为了凸显问题
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                /*
                    ticket-- 不是一个原子操作。这个操作是一个整体 不可分割；
                    1、获取ticket原来的值 拷贝一个副本； 10
                    2、将ticket的值减一，覆盖原来的值；

                 */
            }
        }

    }
}
