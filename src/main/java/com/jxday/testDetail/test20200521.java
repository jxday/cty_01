package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200521
 * @create 2020-05-21 16:38
 * @Version 1.0.0
 */
public class test20200521 {
    public static void main(String[] args) {
//        Base64.Encoder encoder = Base64.getEncoder();
//        encoder.withoutPadding()
        HashSet<Person> set = new HashSet<>();
        Person person = new Person();
        person.setAge(1);
        person.setName("zhangsan");
        System.out.println(set.add(person));
        System.out.println(set.add(person));
        System.out.println(set.add(person));

        HashMap<String, Person> map = new HashMap<>();
        System.out.println(map.put(person.getName(),person));
        System.out.println(map.put(person.getName(),person));
        System.out.println(map.put(person.getName(),person));
    }
}
