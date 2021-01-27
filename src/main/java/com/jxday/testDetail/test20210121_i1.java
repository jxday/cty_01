package com.jxday.testDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210121_i1
 * @create 1/21/21 5:43 PM
 * @Version 1.0.0
 */
@Service
public class test20210121_i1 implements test20210121_s1 {
    
    @Autowired
    test20210121_s2 test20210121_s2;
    
    @Override
    @Transactional
    public void s1() {
        test20210121_s2.s2();
    }
}
