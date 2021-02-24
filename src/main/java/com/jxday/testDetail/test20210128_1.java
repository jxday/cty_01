package com.jxday.testDetail;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210128_1
 * @create 1/28/21 4:05 PM
 * @Version 1.0.0
 */
@Service("test20210128_1test")
public class test20210128_1 {
    
    
    @Transactional
    public void method(int integer){
        integer += 1;
    }
}
