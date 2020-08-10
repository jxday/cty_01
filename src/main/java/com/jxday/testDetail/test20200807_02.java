package com.jxday.testDetail;

import lombok.SneakyThrows;

import java.util.concurrent.*;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200807_02
 * @create 2020-08-07 17:47
 * @Version 1.0.0
 */
public class test20200807_02 {
    
    private static final CyclicBarrier cyc = new CyclicBarrier(2, new Runnable() {
        @Override
        public void run() {
            System.err.println(Thread.currentThread().getName()+"  :  task begin");
            System.err.println(Thread.currentThread().isInterrupted()+"  : s interruote state");
            Thread.currentThread().interrupt();
            System.err.println(Thread.currentThread().isInterrupted()+"  : ss interruote state");
            System.err.println(Thread.currentThread().getName()+"  :  task end");
        }
    });
    
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 6; i++) {
            pool.submit(getRunnable());
            Thread.currentThread().sleep(100);
        }
        Thread.currentThread().join();
        pool.shutdown();
    }

    private static Runnable getRunnable() {
        return new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"  :  park");
                System.err.println(Thread.currentThread().isInterrupted()+"  : a interruote state");
                cyc.await();
                System.err.println(Thread.currentThread().isInterrupted()+"  : aa interruote state");
                System.out.println(Thread.currentThread().getName()+"  :  unpark");
            }
        };
    }


}
