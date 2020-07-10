package com.jxday.testDetail;

/**
 * 〈ThreadLocal〉
 *
 * @author cty
 * @ClassName test20200702_2
 * @create 2020-07-02 15:30
 * @Version 1.0.0
 */
public class test20200702_2 {
    
    private static ThreadLocal<String> local1 = new ThreadLocal<>();
    
    private static ThreadLocal<String> local2 = new ThreadLocal<>();
    
    private static ThreadLocal<String> local3 = new ThreadLocal<>();
    
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                local1.set("111");
                local2.set("2");
                local2.set("22");
                local2.set("222");
                local3.set("333");
                print(Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println();
    }
    
    public static void print(String a){
        System.out.println(a + " -1 :" + local1.get());
        System.out.println(a + " -2 :" + local2.get());
        System.out.println(a + " -3 :" + local3.get());
    }
    
}
