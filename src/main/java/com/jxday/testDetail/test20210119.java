package com.jxday.testDetail;

import com.jxday.modules.codereview.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * 〈〉
 *        ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
 *         test20210119 test = (test20210119)context.getBean("test");
 *         test.test();
 *         
 *         AutowiredListDemo中同时存在两个people和一个set<People>时，只会注入两个people
 *         
 *         详细：https://blog.csdn.net/f641385712/article/details/88410362
 *         
 * @author cty
 * @ClassName test20210119
 * @create 1/19/21 2:44 PM
 * @Version 1.0.0
 */
@Component("test")
public class test20210119 {

    private Set<People> people;
    private Map<String,People> peopleMap;

    @Autowired
    public void setMovieCatalogs(Set<People> people) {
        this.people = people;
    }

    @Autowired
    public void setPeopleMap(Map<String,People> peopleMap) {
        this.peopleMap = peopleMap;
    }


    public void test(){
        System.err.println("test start !");
        System.err.println("set start !");
        for (People person : people) {
            System.err.println(person);
        }
        System.err.println("map start");
        Set<Map.Entry<String, People>> set = peopleMap.entrySet();
        for (Map.Entry<String, People> entry : set) {
            System.err.println(entry.getKey());
            System.err.println(entry.getValue());
        }
    }
}
