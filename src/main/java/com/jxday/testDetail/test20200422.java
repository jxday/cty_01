package com.jxday.testDetail;

import org.apache.shiro.crypto.hash.Hash;
import org.assertj.core.internal.Integers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200422
 * @create 2020-04-22 18:02
 * @Version 1.0.0
 */
public class test20200422 {
    public static void main(String[] args) {
        Object o = new Object();
        boolean equals = o.equals("");
        int i = o.hashCode();
        
        String s = "2";
        String s1 = "22";
        s.equals("");
        s.hashCode();
        //每个字符占5位
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(Integer.toBinaryString(s.hashCode()));
        System.out.println(Integer.toBinaryString(s1.hashCode()));

        HashSet<Object> set = new HashSet<>();
        set.add("");

        HashMap<Object, Object> map = new HashMap<>();
        map.put("","");
        Set<Object> keySet = map.keySet();
        keySet.add("");
    }

    public static void test1() {
        boolean aa= true;
        boolean ss= false;
        boolean dd= true;
        boolean ff= false;

        System.out.println(aa^ss);
        System.out.println(aa^dd);
        System.out.println(ss^ff);

        System.out.println(aa^ss^ff);
        //一样 false
        //不一样 true
    }
}
