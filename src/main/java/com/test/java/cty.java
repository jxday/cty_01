package com.test.java;

import com.test.java.entity.Person;
import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName cty
 * @create 2020-03-21 13:55
 * @Version 1.0.0
 */
public class cty {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Class<?> userClass = ClassUtils.getUserClass(objects);
        System.out.println(userClass);
    }
}
