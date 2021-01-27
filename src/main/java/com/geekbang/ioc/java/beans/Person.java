package com.geekbang.ioc.java.beans;

/**
 * 〈〉
 *
 * Setter/Getter 方法
 * 可写方法 writable/可读方法   readable    
 * @author cty
 * @ClassName Person
 * @create 1/23/21 4:49 PM
 * @Version 1.0.0
 */
public class Person {
    
    String name;        //property
    
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
