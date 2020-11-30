package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20201125
 * @create 11/25/20 4:09 PM
 * @Version 1.0.0
 */
public class test20201125 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("111");
        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator1 = list.iterator();
        System.out.println(iterator == iterator1);
    }
}
