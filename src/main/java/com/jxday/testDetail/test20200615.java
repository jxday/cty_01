package com.jxday.testDetail;

import lombok.SneakyThrows;

import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * 〈异步调用，执行任务〉
 *   main线程调用执行执行器的执行方法，执行方法创建新的线程执行异步任务，通过wait/notifyAll进行通讯，在thread-0线程任务执行完成之后可以根据结果接口获取任务返回值。
 *   加锁的意义在于保证任务线程执行完任务才可以获取任务的返回值。
 *   
 * @author cty
 * @ClassName test20200615
 * @create 2020-06-15 10:56
 * @Version 1.0.0
 */
public class test20200615 {

    public static void main(String[] args) throws Exception {
        test20200615 test20200615 = new test20200615();
        test20200615.domain();
    }

    public void domain() throws Exception {
        MyExecutor executor = new MyExecutor();
        //子任务
        Callable<Integer> subTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //…执行异步任务
                int millis = (int) (Math.random() * 1000);
                System.out.println("call："+Thread.currentThread().getName());
                System.out.println("随机数："+millis);
                Thread.sleep(millis);
                return millis;
            }
        };
        //异步调用，返回一个MyFuture对象
        MyFuture<Integer> future = executor.execute(subTask);
        //…执行其他操作
        try {
            //获取异步调用的结果
            System.out.println("get："+Thread.currentThread().getName());
            Integer result = future.get();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public class MyExecutor<V>{

        public <V> MyFuture<V> execute(final Callable<V> task) throws Exception {
            final Object lock = new Object();
            final ExecuteThread thread = new ExecuteThread<V>(lock,task);
            thread.start();
            MyFuture<V> future = new MyFuture<V>() {
                @Override
                public V get() throws Exception{
                    synchronized (lock){
                        while (!thread.isDone()){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                
                            }
                        }
                        if (thread.getException() != null){
                            throw thread.getException();
                        }
                        return (V) thread.getResult();
                    }
                }
            };
            return future;
        }

        
    }
    
    public class ExecuteThread<V> extends Thread{
        private V result = null;
        private Object lock;
        private boolean done = false;
        private Callable<V> task;
        private Exception exception;

        public ExecuteThread(Object lock, Callable<V> task) {
            this.lock = lock;
            this.task = task;
        }
        
        @Override
        public void run(){
            try {
                result = task.call();
            } catch (Exception e) {
                exception = e;
            }finally {
                synchronized (lock){
                    done = true;
                    lock.notifyAll();
                }
            }
        }

        public V getResult() {
            return result;
        }

        public boolean isDone() {
            return done;
        }

        public Exception getException() {
            return exception;
        }
    }

    public interface MyFuture<V>{
        V get() throws Exception;
    }
}
