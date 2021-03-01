package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 〈优先级队列〉     PriorityQueue只有在第一次添加的时候是按照compare比较的，后面对内容进行的修改将会导致排序不可用
 *
 * @author cty
 * @ClassName test20210225
 * @create 2/25/21 1:45 PM
 * @Version 1.0.0
 */
public class test20210225 {
    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<Person>(
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        int age1 =o1 == null ? 0 : o1.getAge() == null ? 0 : o1.getAge() ;
                        int age2 =o2 == null ? 0 : o2.getAge() == null ? 0 : o2.getAge() ;
                        return age1 > age2 ? 1 : age1 == age2 ? 0 : -1;
                    }
                }
        );

        PriorityQueue<Person> queue1 = new PriorityQueue<>((o1, o2) -> {
            int age1 = o1 == null ? 0 : o1.getAge() == null ? 0 : o1.getAge();
            int age2 = o2 == null ? 0 : o2.getAge() == null ? 0 : o2.getAge();
            return age1 > age2 ? 1 : age1 == age2 ? 0 : -1;
        });

       
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person3.setAge(7);
        person2.setAge(5);
        person1.setAge(3);
        queue.add(person1);
        queue.add(person3);

        Person person = new Person();
        queue.add(person);
        person.setAge(5);
        queue.add(person2);

        System.out.println(queue);
    }
}
