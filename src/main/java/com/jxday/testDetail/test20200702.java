package com.jxday.testDetail;

/**
 * 〈死锁〉
 *
 * @author cty
 * @ClassName test20200702
 * @create 2020-07-02 10:38
 * @Version 1.0.0
 */
public class test20200702 {
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    private static void startThreadA() {
        Thread aThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockA) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    synchronized (lockB) {
                    }
                }
            }
        };
        aThread.start();
    }

    private static void startThreadB() {
        Thread bThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockB) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    synchronized (lockA) {
                    }
                }
            }
        };
        bThread.start();
    }

    public static void main(String[] args) {
//        startThreadA();
//        startThreadB();
        test1();
    }

    private static void test1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5){
                Thread.currentThread().setDaemon(true);   //在线程启动之前设置。。。
            }
        }
    }
}
