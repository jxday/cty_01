package com.jxday.spring.framework.FInitDestoryMethod;

import javax.annotation.PreDestroy;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName PreDestroyDemo
 * @create 1/5/21 11:02 AM
 * @Version 1.0.0
 */
//@Component
public class PreDestroyDemo {
    public PreDestroyDemo() {
        System.err.println("this is PreDestroyDemo's construct method");
    }
    
    @PreDestroy
    public void preDestroy(){
        System.err.println("this is PreDestroyDemo's @PreDestory demo");
    }
}
