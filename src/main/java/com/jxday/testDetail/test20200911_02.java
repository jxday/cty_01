package com.jxday.testDetail;

import java.util.ArrayList;

/**
 * 〈jConsole测试〉
 *参数：-Xms100m -Xmx100m -XX:+UseSerialGC
 * 
 * @author cty
 * @ClassName test20200911_02
 * @create 2020-09-11 15:45
 * @Version 1.0.0
 */
public class test20200911_02 {
    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024];    
    }
    
    public static void fillHeap(int num) throws InterruptedException {
        ArrayList<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(500);
            list.add(new OOMObject());
        }
        
        System.gc();
    }
    
    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
    
}
