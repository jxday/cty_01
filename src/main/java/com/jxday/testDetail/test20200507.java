package com.jxday.testDetail;

import com.jxday.modules.DataStructure.String.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200507
 * @create 2020-05-07 09:22
 * @Version 1.0.0
 */
public class test20200507 {
    public static void main(String[] args) {
        int[][] data = new int[4][4];
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            String next = scanner.next();
////            System.out.println(next);
//        }
        
        
        int x,y;

        long l = System.nanoTime();
        long l1 = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l1);
        
        
        //匿名内部类和lambda表达式
        List<String> list = new ArrayList<>();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        
        list.sort((s1,s2)->{
            return 0;
        });
        
    }
    
    public enum day2{
        one("zhouyi","z1");
                          
        private String py;
        private String jx;

        day2(String zhouyi, String z1) {
            this.py = zhouyi;
            this.jx = z1;
        }
    }
}
