package com.jxday.testDetail;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * LinkedBlockingQueue模拟的生产者消费者
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<String> dataQueue = new LinkedBlockingQueue<String>();
        Producer p11 = new Producer("生产者01号", dataQueue);
        Producer p22 = new Producer("生产者02号", dataQueue);
        Consumer c11 = new Consumer("消费者01号", dataQueue);
        Consumer c22 = new Consumer("消费者02号", dataQueue);
        Consumer c33 = new Consumer("消费者03号", dataQueue);
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(p11);
        service.submit(p22);
        service.submit(c11);
        service.submit(c22);
        service.submit(c33);
    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    private String username;
    private BlockingQueue<String> dataQueue;
    Producer(String username, BlockingQueue<String> dataQueue) {
        this.username = username;
        this.dataQueue = dataQueue;
    }
    
    public void run() {
        try {
            while (true) {
                //产生0~~99随机整数
                int productID = (int)(Math.random()*100);
                dataQueue.put(String.valueOf(productID));
                System.out.println(username + "已生产：" + productID + "");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {
    private String username;
    private BlockingQueue<String> dataQueue;
    Consumer(String username, BlockingQueue<String> dataQueue) {
        this.username = username;
        this.dataQueue = dataQueue;
    }
    public void run() {
        try {
            while (true) {
                String product = dataQueue.take();
                System.err.println(username + "已消费：" + product + "");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}