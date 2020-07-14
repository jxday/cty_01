package com.jxday.testDetail;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200713_2
 * @create 2020-07-14 09:26
 * @Version 1.0.0
 */
public class test20200713_2 {
    private static ReentrantLock lock = new ReentrantLock();

    private static Condition notFull = lock.newCondition();

    private static Condition notEmpty = lock.newCondition();

    private static int queueSize = 10;

    private static Queue<String> queue = new LinkedBlockingDeque<>();

    private static volatile int total;

    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (queue.size() == queueSize){
                        notFull.await();
                    }
                    long l = System.currentTimeMillis();
                    queue.add(l+"");
                    System.out.println("生产了："+l);
                    notEmpty.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (queue.size() == 0){
                        notEmpty.await();
                    }
                    System.out.println(System.currentTimeMillis()+"---消费了："+queue.poll());
                    total++;
                    if (total != 100){
                    }
                    notFull.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
