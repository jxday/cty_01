package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 〈Demo：PriorityBlockingQueue 〉
 *      插入与取出都会维持最小堆原则
 * @author cty
 * @ClassName test20200728
 * @create 2020-07-28 15:32
 * @Version 1.0.0
 */
public class test20200728 {
    public static void main(String[] args) {
        test1();
    }
    
    public static void test1(){
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(1);
        queue.add(9);
        queue.add(2);
        queue.add(11);
        queue.add(12);
        queue.add(4);
        queue.add(5);
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.err.println(iterator.next());
        }
        for (int i = 0; i < 7; i++) {
            Integer poll = queue.poll();
            System.out.println(poll);
        }
    }
}
