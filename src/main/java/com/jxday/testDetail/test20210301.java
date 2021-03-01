package com.jxday.testDetail;

import java.util.concurrent.CountDownLatch;

/**
 * 〈volatile 变量自增测试〉 结论：volatile运算在并发下并不是安全的
 *
 * @author cty
 * @ClassName test20210301
 * @create 3/1/21 3:59 PM
 * @Version 1.0.0
 */
public class test20210301 {

    public static volatile int race = 0;
    private static final int THREADS_COUNT = 20;
    

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        CountDownLatch countDownLatch = new CountDownLatch(THREADS_COUNT);
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i1 = 0; i1 < 10000; i1++) {
                        increase();
                    }
                    countDownLatch.countDown();
                }
            });
            threads[i].start();
        }

        System.out.println("main thread start !");
        
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("countDownLatch异常");
        }

        //因为使用idea，因此活动线程的数量并不是1，下面代码打印出相关数据
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        System.err.println(Thread.activeCount());
        Thread.currentThread().getThreadGroup().list();
        System.err.println(group);
        System.err.println(group.getName());
        System.err.println(group.getParent());
        
        //Thread类的activeCount()方法用于返回当前线程的线程组中活动线程的数量。
        // 返回的值只是一个估计值，因为当此方法遍历内部数据结构时，线程数可能会动态更改
//        while (Thread.activeCount() > 1){
//            Thread.yield();
//        }
        
        System.err.println("race是：" + race);

    }
    
    public static void increase() {
        race++;
    }
    
    
    
}
