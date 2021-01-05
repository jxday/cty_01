package com.jxday.spring.framework;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName InitMethodDemo
 * @create 1/4/21 5:33 PM
 * @Version 1.0.0
 */

public class InitMethodDemo {
    private void initDemo(){
        System.err.println("this is initDemo method : " + System.currentTimeMillis());
    }
    
    private void destoryDemo(){
        System.err.println("this is destoryDemo method : " + System.currentTimeMillis());
    }
    
    private void init(){
        System.err.println("this is default init method");
    }
    
    private void destory(){
        System.err.println("this is default destory method");
    }
}
