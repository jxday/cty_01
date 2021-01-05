package com.jxday.spring.framework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName PostConstructorDemo
 * @create 1/4/21 5:51 PM
 * @Version 1.0.0
 */
//@Component
public class PostConstructDemo {

    public PostConstructDemo() {
        System.err.println("this is PostConstructDemo's construct method : " + System.currentTimeMillis());
    }

//    @PostConstruct
    private void postConstruct(){
        System.err.println("this is PostConstructDemo's @PostConstruct demo : " + System.currentTimeMillis());
    }
    
}
