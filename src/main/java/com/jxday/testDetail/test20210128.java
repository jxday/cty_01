package com.jxday.testDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210128
 * @create 1/28/21 4:04 PM
 * @Version 1.0.0
 */
@Controller("test20210128Controller")
public class test20210128 {
    
    @Autowired
    private test20210128_1 test20210128_1;
    
    public void method(int i){
        synchronized (test20210128.class){
            test20210128_1.method(i);
        }
    }
    
    
    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    private test20210128_1 getTest(){
        return new test20210128_1();
    }
    
}
