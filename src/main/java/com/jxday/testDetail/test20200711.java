package com.jxday.testDetail;


import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * 〈final修饰变量，只会赋值一次〉
 *
 * @author cty
 * @ClassName test20200711
 * @create 2020-07-11 16:25
 * @Version 1.0.0
 */
public class test20200711 {
    
    static  final class Node{

        @Override
        public String toString() {
            return "Node{" +
                    "num=" + num +
                    '}';
        }

        private Integer num;

        public Node(Integer num) {
            this.num = num;
        }

        volatile Node next;

        public Node predecessor() {
            Node p = next;
            if (p == null)
                throw new NullPointerException();
            else
                return p;    
        }
    }
    public static void main(String[] args) {
        Node node = new Node(0);
        Node out = node;

        for (int i = 1; i <= 100; i++) {
            Node node1 = new Node(i);
            node.next = node1;
            node = node1;
        }
        
//        for (;;){
//            if (out == null){
//                return;
//            }else {
//                System.out.println(out);
//                out = out.next;
//            }
//        }
        
        t1(out);
        
    }
    
    public static void t1(Node node){
        for (;;) {
            final Node p = node.predecessor();
            System.out.println(p);
            if (node == null){
                return;
            }
        }
    }
}
