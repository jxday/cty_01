package com.jxday.spring.framework.IAutowired;

import com.jxday.modules.codereview.entity.People;
import com.test.java.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 〈test20210119 〉
 * 
 *         Set persons = context.getBean("persons",Set.class);
 *         for (Object person : persons) {
 *             People people = (People)person;
 *             System.out.println(people);
 *         }
 *         
 * @author cty
 * @ClassName AutowiredListDemo
 * @create 1/19/21 3:12 PM
 * @Version 1.0.0
 */

@Component
public class AutowiredListDemo {
    
    @Bean
    Set<People> persons(){
        Set<People> objects = new HashSet<>();
        objects.add(People.ofName("cty1"));
        objects.add(People.ofName("cty2"));
        return objects;
    }

    @Bean
    Map<String,People> peopleMap(){
        Map<String,People> objects = new HashMap<>();
        objects.put("map1",People.ofName("map1"));
        objects.put("map2",People.ofName("map2"));
        return objects;
    }
    
    @Bean
    People cty3(){
        return People.ofName("cty3");
    }


    @Bean
    People cty4(){
        return People.ofName("cty4");
    }
}
