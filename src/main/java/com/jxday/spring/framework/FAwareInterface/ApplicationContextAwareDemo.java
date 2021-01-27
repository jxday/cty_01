package com.jxday.spring.framework.FAwareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName ApplicationContextAwareDemo
 * @create 1/8/21 3:18 PM
 * @Version 1.0.0
 */
//@Component
public class ApplicationContextAwareDemo implements ApplicationContextAware {
    
    private ApplicationContextAware applicationContextAware;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContextAware = applicationContextAware;
        System.err.println("ApplicationContextAwareDemo's applicationContext name is : " + applicationContext.getApplicationName());
        System.err.println("ApplicationContextAwareDemo's applicationContext displayName is : " + applicationContext.getDisplayName());
        System.err.println("ApplicationContextAwareDemo's applicationContext id is : " + applicationContext.getId());
        AutowireCapableBeanFactory factory = applicationContext.getAutowireCapableBeanFactory();
        BeanNameAwareDemo cty = (BeanNameAwareDemo)factory.getBean("cty");
        cty.cty();
    }
}
