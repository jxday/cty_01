package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.text.ParseException;

/**
 * 〈ConcurrentLinkedQueue-变量传递〉    传递的是变量指向的地址
 *
 * @author cty
 * @ClassName test20200722_02
 * @create 2020-07-22 10:49
 * @Version 1.0.0
 */
public class test20200722_02 {
    private static Person person = new Person("longdd","man",12);
    public static void main(String[] args) throws ParseException {
        test2();
    }

    public static void test1() {
        Person t = person,p = t;
        System.out.println(person);
        System.out.println(t);
        System.out.println(p);

        System.out.println("===================");
        person = new Person("yyf","man",11);
        System.out.println(person);
        System.out.println(t);
        System.out.println(p);

        System.out.println("===================");
        t = null;
        System.out.println(t);
        System.out.println(p);
    }

    /**
     * @see java.util.concurrent.ConcurrentLinkedDeque#offer(Object) 
     * p = (p != t && t != (t = tail)) ? t : q;          //有新的尾巴就用新的尾巴，没有就继续往后找
     */
    public static void test2() {
        Person a = person;
        System.out.println(a != (a =person));
        System.out.println(a);
        person = new Person("yyf","man",11);
        System.out.println(a != (a =person));
        System.out.println(a);
    }
}
