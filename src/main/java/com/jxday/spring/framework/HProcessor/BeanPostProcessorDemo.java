package com.jxday.spring.framework.HProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName BeanPostProcessorDemo
 * @create 1/11/21 11:50 AM
 * @Version 1.0.0
 */
//@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        
        return null;
    }
}
