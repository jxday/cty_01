package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200528
 * @create 2020-05-28 10:59
 * @Version 1.0.0
 */
public class test20200528 {
    public static void main(String[] args) {
        String s = new String("aaa");
        String s1 = new String();
        
        s.intern();

        List<String> list = new ArrayList<>();
        Collections.checkedList(list,String.class);
        Collections.checkedCollection(list,String.class);
        
        
    }
}
