package com.jxday.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.test.java.entity.Person;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName testClass
 * @create 2020-02-29 22:35
 * @Version 1.0.0
 */
public class testClass {
    public static void main(String[] args) {

        Person person = new Person();
        if (person.getAge() == 1){
            System.out.println("222");
        }

        if (person.getAge() != 1){
            System.out.println("23333333");
        }

        HashSet<Person> set = new HashSet<>();
        set.add(person);

        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> newList = new ArrayList<>();
        for (Object o : list) {
            if (check(newList,o)){
                newList.add(o);
            }
        }        
        
    }

    private static boolean check(ArrayList<Object> newList, Object obj) {
        for (Object o : newList) {
            if (o == obj){      //这里写比较的方法
                return false;
            }
        }
        return true;
    }

    public static BigDecimal toBigDecimal(String number) {
        return null == number ? BigDecimal.ZERO : new BigDecimal(number);
    }
}
