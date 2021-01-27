package com.jxday.testDetail;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * 〈bloomfilter〉
 *
 * @author cty
 * @ClassName test20210125
 * @create 1/25/21 3:45 PM
 * @Version 1.0.0
 */
public class test20210125 {
    private static int total = 1000000;
    private static BloomFilter<Integer> bf = BloomFilter.create(Funnels.integerFunnel(), total);
//    private static BloomFilter<Integer> bf = BloomFilter.create(Funnels.integerFunnel(), total, 0.001);

    public static void main(String[] args) {
        
    }
    
    
}
