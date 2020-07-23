package com.jxday.testDetail;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200605
 * @create 2020-06-05 14:03
 * @Version 1.0.0
 */
public class test20200605 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };
        
        new Thread(runnable).start();
        
        synchronized (runnable){
            
        }
    }
    
    
    public class HelloThread extends Thread{
        @Override
        public void run() {
            super.run();
            System.out.println("hello");
        }
    }
}
