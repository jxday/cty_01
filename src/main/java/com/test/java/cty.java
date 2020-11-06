package com.test.java;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.java.entity.Person;
import lombok.SneakyThrows;
import org.springframework.util.ClassUtils;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName cty
 * @create 2020-03-21 13:55
 * @Version 1.0.0
 */
public class cty {
    public static void main(String[] args) throws InterruptedException {
        new Object();   //2020年8月25日，new的对象
        
        Thread thread = new Thread(new InterruptThread());
        thread.start();
        System.out.println("main线程启动了");
        TimeUnit.MILLISECONDS.sleep(1000);
        thread.interrupt();
    }

    public static class InterruptThread implements Runnable {
        
        @SneakyThrows 
        @Override
        public void run() {
//阻塞
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("我被中断了");
                    return;
                }
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("我会一直执行直到interrupt()方法被调用");
            }

        }


    }       
    
}
