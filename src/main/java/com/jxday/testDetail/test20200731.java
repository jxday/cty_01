package com.jxday.testDetail;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 〈线程池demo〉
 *
 * @author cty
 * @ClassName test20200731
 * @create 2020-07-31 16:37
 * @Version 1.0.0
 */
public class test20200731 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("第"+i+"次循环时间时间"+System.currentTimeMillis());
                }
            }
        });
        
        while (true){
            try {
                if (executorService.awaitTermination(1,TimeUnit.SECONDS)) break;
                System.err.println("等待中。。。"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
        System.err.println("shutdown"+System.currentTimeMillis());
        
    }
}
