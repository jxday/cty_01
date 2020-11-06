package com.jxday.testDetail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200827
 * @create 2020-08-27 16:26
 * @Version 1.0.0
 */
public class test20200827 {
    public static void main(String[] args) {
        String c= "f";
        LinkedHashMap<String, String> map = new LinkedHashMap<>(16,0.75f,true);
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("c","1");
        map.put("d","2");
        map.put("a","5");
//        map.get(c);
        map.get("c");
        map.put("d","3");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }


    }
}
