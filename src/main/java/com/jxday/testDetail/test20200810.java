package com.jxday.testDetail;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import lombok.SneakyThrows;
import org.apache.poi.ss.formula.functions.T;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈CyclicBarrier - 依次打印〉
 *
 * @author cty
 * @ClassName test20200810
 * @create 2020-08-10 09:00
 * @Version 1.0.0
 */
public class test20200810 {
    
    private static CyclicBarrier cyc = new CyclicBarrier(2);
    
    public static void main(String[] args) throws InterruptedException {

        AtomicInteger num = new AtomicInteger(0);

        LinkedBlockingQueue link = new LinkedBlockingQueue<Integer>(20);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
                
                
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                link.add(i);
                try {
                    cyc.await();
                    cyc.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
            synchronized (test20200810.class){
                if (link.size() == 20){
                    test20200810.class.notify();
                }
            }
        },"thread-1").start();

        new Thread(() -> {
            for (int i = 100; i < 110; i++) {
                link.add(i);
                try {
                    cyc.await();
                    cyc.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
            synchronized (test20200810.class){
                if (link.size() == 20){
                    test20200810.class.notify();
                }
            }
        },"thread-2").start();


        synchronized (test20200810.class)
        {
            test20200810.class.wait();
        }
        System.out.println(link);
    }
}
