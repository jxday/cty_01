package com.jxday.testDetail;

import com.test.java.cty;
import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * 〈线程中断〉
 *
 * @author cty
 * @ClassName test20200817_02
 * @create 2020-08-17 16:56
 * @Version 1.0.0
 */
public class test20200817_02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new cty.InterruptThread());
        thread.start();
        System.out.println("main线程启动了");
        TimeUnit.MILLISECONDS.sleep(1000);
        thread.interrupt();
    }

    public static class InterruptThread implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
//阻塞
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("我被中断了");
                    return;
                }
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("我会一直执行直到interrupt()方法被调用");
            }

        }


    }
}
