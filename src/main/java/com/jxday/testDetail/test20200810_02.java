package com.jxday.testDetail;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200810_02
 * @create 2020-08-10 13:50
 * @Version 1.0.0
 */
public class test20200810_02 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.newCondition();
        Thread.interrupted();
        Thread.currentThread().interrupt();
        Thread.currentThread().isInterrupted();

    }
    
    class putBoy implements Runnable{

        private LinkedBlockingQueue<String> queue;
        
        
        
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                while (queue.size() == 0){
                    
                }
            }    
        }
    }
}
