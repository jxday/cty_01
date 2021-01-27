package com.jxday.testDetail;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210121_i2
 * @create 1/21/21 5:43 PM
 * @Version 1.0.0
 */

@Service
public class test20210121_i2 implements test20210121_s2 {
    
    @Override
    @Transactional
    public void s2() {
        System.out.println("this is s2");
    }
    
    
    public void test(){
        System.out.println("this is test");
        System.out.println(0/1);
    } 
}
