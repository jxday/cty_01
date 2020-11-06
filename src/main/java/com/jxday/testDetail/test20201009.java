package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.util.*;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20201009
 * @create 2020-10-09 17:14
 * @Version 1.0.0
 */
public class test20201009 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        Iterator<String> iterator1 = list.iterator();
        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator.next());

        iterator.set("ppp");
        iterator.add("ooo");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        LinkedList<String> list1 = new LinkedList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");
        for (String s : list1) {
            System.out.println(s);
        }
        Iterator<String> iterator2 = list1.iterator();
        System.err.println("============");
        ListIterator<String> listIterator = list1.listIterator();
        for (String s : list1) {
            System.out.println(s);
        }
        System.err.println("============");
        Iterator<String> stringIterator = list1.descendingIterator();
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
