package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200506
 * @create 2020-05-06 14:16
 * @Version 1.0.0
 */
public class test20200506 {
    public static void main(String[] args) {
        int digit = Character.digit('A', 16);
//        System.out.println(digit);

        String aaa = "aaa";
        boolean empty = "aaa".isEmpty();
        System.out.println(empty);
        
//        aaa.indexOf();
        int zzz = "AAA".compareTo("ZZZ");
        System.out.println(zzz);

        List<Object> list = new ArrayList<>(5);
        list.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
