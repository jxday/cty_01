package com.jxday.testDetail;

import java.util.*;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200525
 * @create 2020-05-25 16:41
 * @Version 1.0.0
 */
public class test20200525 {
    public static void main(String[] args) {
        TreeMap<TtmsOrderPackPrice, Integer> map = new TreeMap<>(new Comparator<TtmsOrderPackPrice>() {
            @Override
            public int compare(TtmsOrderPackPrice o1, TtmsOrderPackPrice o2) {
                return 0;
            }
        });

        TreeSet<TtmsOrderPackPrice> treeSet = new TreeSet<>(new Comparator<TtmsOrderPackPrice>() {
            @Override
            public int compare(TtmsOrderPackPrice o1, TtmsOrderPackPrice o2) {
                return 0;
            }
        });
        
        map.keySet();

        Set<TtmsOrderPackPrice> set = map.keySet();
    }
}
