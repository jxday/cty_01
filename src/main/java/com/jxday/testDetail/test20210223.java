package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 〈array-list 转换〉
 *
 * @author cty
 * @ClassName test20210223
 * @create 2/24/21 1:57 PM
 * @Version 1.0.0
 */
public class test20210223 {

    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";
        
        //效率高
        ArrayList<String> list = new ArrayList<>();
        boolean all = Collections.addAll(list, strings);

        //读写方便
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(strings));

        //只读
        List<String> list2 = Arrays.asList(strings);
//        list2.add("6");
        
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }
}
