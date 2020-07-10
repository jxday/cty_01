package com.jxday.testDetail;

import com.jxday.common.utils.ReadUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200611
 * @create 2020-06-11 10:24
 * @Version 1.0.0
 */
public class test20200611 {
    public static void main2(String[] args) {
        Integer a = null;
        a = a - 1;
        System.out.println(a);
        
        
    }

    public static void main1(String[] args) {
        String s = ReadUtil.readFileContent("/Users/cty/代码库/jxday_web_01/src/main/resources/testFile/t3");
        
    }

    private static void startModifyThread(final List<String> list) {
        Thread modifyThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    list.add("item " + i);
                    try {
                        Thread.sleep((int) (Math.random() * 10));
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        modifyThread.start();
    }
    private static void startIteratorThread(final List<String> list) {
        Thread iteratorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for(String str : list) {
                    }
                }
            }
        });
        iteratorThread.start();
    }
    public static void main(String[] args) {
        final List<String> list = Collections
                .synchronizedList(new ArrayList<String>());
        startIteratorThread(list);
        startModifyThread(list);
    }
}
