package com.jxday.testDetail;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * 〈WeakReferenc弱引用Demo〉
 *
 * @author cty
 * @ClassName test20200817_03
 * @create 2020-08-17 16:56
 * @Version 1.0.0
 */
public class test20200817_03 {
    
    private static CountDownLatch count1 = new CountDownLatch(1);
    private static CountDownLatch count2 = new CountDownLatch(1);

    @SneakyThrows
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        
//        new Thread(new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//                threadLocal.set("aaa");
//                System.out.println(threadLocal);
//                System.out.println(threadLocal.get());
//                Thread.sleep(10000);
////                count2.countDown();
////                count1.await();
//                System.out.println(threadLocal);
//                System.out.println(threadLocal.get());
//            }
//        }).start();
        
        
        threadLocal.set("main");
        System.out.println(threadLocal);
        System.out.println(threadLocal.get());

        ArrayList<ThreadLocal<String>> list = new ArrayList<ThreadLocal<String>>();
        list.add(threadLocal);
        threadLocal.remove();
//        count2.await();
//        Thread.sleep(1000);
//        System.gc();
//        System.out.println("gc OVER");
        System.out.println(threadLocal);
        System.out.println(threadLocal.get());
//        
//        count1.countDown();
//        
    }
}
