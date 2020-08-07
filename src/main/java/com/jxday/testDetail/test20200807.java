package com.jxday.testDetail;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;

/**
 * 〈CountDownLacth-Demo〉
 *
 * @author cty
 * @ClassName test20200807
 * @create 2020-08-07 14:19
 * @Version 1.0.0
 */
public class test20200807 {

    @SneakyThrows
    public static void main(String[] args) {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(2);
        Worker worker1 = new Worker(startSignal, doneSignal);
        Worker worker2 = new Worker(startSignal, doneSignal);
        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);
        
        thread1.start();
        thread2.start();

        startSignal.countDown();
        System.out.println("start notify");
        
        doneSignal.await();
        System.out.println("done notify");
    }
    
    static class Worker implements Runnable{

        private final CountDownLatch start;
        private final CountDownLatch done;

        public Worker(CountDownLatch start, CountDownLatch done) {
            this.start = start;
            this.done = done;
        }

        @SneakyThrows
        @Override
        public void run() {
            Thread.sleep(10000);

            System.out.println(Thread.currentThread().getName()+"  :  start await");
            start.await();  
            
            work();            
            done.countDown();
        }

        private void work() {
            System.out.println(Thread.currentThread().getName()+"  :  do Work");
        }
    }
}
