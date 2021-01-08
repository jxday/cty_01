package com.jxday.spring.framework.FInitDestoryMethod;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName DisposableBeanImpl
 * @create 1/4/21 6:01 PM
 * @Version 1.0.0
 */

//@Component
public class DisposableBeanImpl implements DisposableBean {

    public DisposableBeanImpl() {
        System.err.println("this is DisposableBeanImpl's construct method : " + System.currentTimeMillis());
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("this is DisposableBeanImpl's destory demo : " + System.currentTimeMillis());
    }
    
    @PreDestroy
    public void preDestory(){
        System.err.println("this is DisposableBeanImpl's preDestory demo : " + System.currentTimeMillis());
    }
}
