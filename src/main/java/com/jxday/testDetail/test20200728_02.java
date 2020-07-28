package com.jxday.testDetail;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import com.test.java.entity.Person;
import com.test.java.entity.PersonDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 〈继承自定义对象，重写equals方法〉
 *
 * @author cty
 * @ClassName test20200728_02
 * @create 2020-07-28 15:47
 * @Version 1.0.0
 */
public class test20200728_02 {
    public static void main(String[] args) {
        ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
        for (int i = 0; i < 5; i++) {
            PersonDTO person = new PersonDTO();
            person.setName("yyf");
            person.setAge(15);
            person.setMale(i+"号");
            list.add(person);
        }


        HashMap<PersonDTO,String> map = new HashMap<PersonDTO,String>();
        for (int i = 0; i < list.size(); i++) {
            PersonDTO personDTO = list.get(i);
            map.put(personDTO,personDTO.getMale());
        }

        System.out.println(map.size());
        Set<Map.Entry<PersonDTO, String>> entries = map.entrySet();
        entries.forEach(System.out::println);
    }
}
