package com.jxday.spring.framework.FAwareInterface;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName BeanNameAwareDemo
 * @create 1/8/21 3:16 PM
 * @Version 1.0.0
 */
//@Component(value = "cty")
public class BeanNameAwareDemo implements BeanNameAware {
    
    private String BeanName;
    
    @Override
    public void setBeanName(String name) {
        this.BeanName = name;
        System.err.println("BeanNameAwareDemo's BeanName is : " + name);
    }
    
    public void cty(){
        System.err.println("this is cty");
    }
}
