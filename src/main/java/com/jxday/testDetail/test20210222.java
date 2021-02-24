package com.jxday.testDetail;

import com.test.java.entity.Person;
import org.apache.poi.ss.formula.functions.T;

import java.util.*;

/**
 * 〈hashmap〉    只有当hashMap发生结构性变化时，modCount才会自增
 *
 * @author cty
 * @ClassName test20210222
 * @create 2/22/21 2:03 PM
 * @Version 1.0.0
 */
public class test20210222{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Object o = new Object();
        Person person = new Person();
        person.setAge(3);
        map.put(1,1);
        map.put(2,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        System.err.println(map.putIfAbsent(4,8));
        System.out.println(map);
        System.out.println(map.hashCode());
        Integer n = 32674;
        System.out.println(n.hashCode());
        System.out.println(o.hashCode());
        System.out.println(person.hashCode());
        
        
        
        
//        Collections.sort(new ArrayList<>());
    }


    

}
