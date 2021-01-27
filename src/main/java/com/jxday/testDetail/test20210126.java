package com.jxday.testDetail;

import com.geekbang.ioc.java.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210126
 * @create 1/26/21 11:26 PM
 * @Version 1.0.0
 */
public class test20210126 {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        
//        person1.setAge(1);
//        person2.setAge(2);
//        person3.setAge(1);
        
        person1.setName("zhang1");
        person2.setName("zhang2");
        person3.setName("zhang3");

        List<Person> list = new ArrayList<>();

        Map<Integer, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getAge));
        for (Map.Entry<Integer, List<Person>> entry : collect.entrySet()) {
            System.out.println(entry.getKey());
            
        }

    }
}
