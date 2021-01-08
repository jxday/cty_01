package com.jxday.spring.framework.FInitDestoryMethod;

import org.springframework.beans.factory.InitializingBean;

/**
 * 〈InitializingBean 的实现类，并且与@PostConstruct 做比较〉
 *
 * @author cty
 * @ClassName InitializingBeanImpl
 * @create 1/4/21 4:53 PM
 * @Version 1.0.0
 */

//@Component
public class InitializingBeanImpl implements InitializingBean {
    public InitializingBeanImpl() {
        while (System.currentTimeMillis() % 100 != 1){

        }
        System.err.println("this is InitializingBeanImpl's construct method : " + System.currentTimeMillis());
    }

//    @PostConstruct
    private void postConstruct(){
        while (System.currentTimeMillis() % 100 != 50){
            
        }
        System.err.println("this is InitializingBeanImpl's @PostConstruct demo : " + System.currentTimeMillis());
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        while (System.currentTimeMillis() % 100 != 55){

        }
        System.err.println("this is afterPropertiesSet : " + System.currentTimeMillis());
    }
}
