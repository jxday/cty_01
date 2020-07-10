package com.jxday.testDetail;

import com.test.java.entity.Person;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200511
 * @create 2020-05-11 17:59
 * @Version 1.0.0
 */
public class test20200511 {
    public static void main(String[] args) {
        String x = new String("沉默王二");
        change(x);
        System.out.println(x);

        Person person = new Person();
        person.setAge(10);
        changeAge(person);
        System.out.println(person.getAge());
        
    }

    public static void change(String x) {
        x = "沉默王三";
    }

    public static void changeAge(Person x) {
        x.setAge(20);
    }
}
