package com.jxday.testDetail;

import java.util.Objects;

/**
 * 〈多线程/wait/notify〉
 *
 * @author cty
 * @ClassName test20200609
 * @create 2020-06-09 14:04
 * @Version 1.0.0
 */
public class test20200609 {
    static final Object lock = 1;

    public static void main(String[] args) {
//       main1(null);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.err.println(Thread.currentThread().getName()+"run");
                    try {
                        System.err.println(Thread.currentThread().getName()+"wait");
                        lock.wait();
                        System.err.println(Thread.currentThread().getName()+"notifyed");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.err.println(Thread.currentThread().getName()+"run");
                    try {
                        System.err.println(Thread.currentThread().getName()+"wait");
                        lock.wait();
                        System.err.println(Thread.currentThread().getName()+"notifyed");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName()+"run");
                    System.out.println(Thread.currentThread().getName()+"notify");
                    lock.notifyAll();
                    System.out.println(Thread.currentThread().getName()+"over");
                    
                }
            }
        });
        try {
                thread.start();
                thread1.start();
                
                Thread.sleep(100);
                thread2.start();

        } catch (Exception e) {


        }




    }
    
    public static class Thread1 extends Thread {
        public void run() {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName()+"run");
                notify();
            }
        }
        
        
    }

    public static void m1(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                K k = new K(3, 2);
                k.produce();
            }
        };
        new Thread(runnable).start();

        K k = new K(1, 2);
        System.out.println("1");
        k.produce();
        k.notifyAll();
        k.setNow(3);
        k.produce();
    }
    
    public static class K {
        //状态锁
        private Object lock = 1;
        //条件变量
        private int now,need;
        public void produce(){
            //同步
            synchronized (lock){
                //当前有的不满足需要，进行等待，直到满足条件
                while(now < need){
                    try {
                        //等待阻塞
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我被唤醒了！");
                }
                
                
                // 做其他的事情
                System.out.println("其他事情");
            }
        }

        public K(int now, int need) {
            this.now = now;
            this.need = need;
        }

        public Object getLock() {
            return lock;
        }

        public void setLock(Object lock) {
            this.lock = lock;
        }

        public int getNow() {
            return now;
        }

        public void setNow(int now) {
            this.now = now;
        }

        public int getNeed() {
            return need;
        }

        public void setNeed(int need) {
            this.need = need;
        }
    }
}
