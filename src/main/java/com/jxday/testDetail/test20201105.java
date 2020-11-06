package com.jxday.testDetail;

import lombok.Synchronized;

import java.util.ArrayList;

/**
 * 〈最初级的线程问题〉
 *      m保存在方法区中，每次虚拟机栈中读取m，以动态链接的形式存入到局部变量表。
 * @author cty
 * @ClassName test20201105
 * @create 2020-11-05 17:37
 * @Version 1.0.0
 */
public class test20201105 {
    
    private static int m = 0;

    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                synchronized (test20201105.class){   //加锁，每个线程独立运行
                    for (int i1 = 0; i1 < 100; i1++) {
                        m++;
                    }
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(m);

    }
}
