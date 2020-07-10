package com.test.java.entity;


import java.util.Objects;

/**
 * 〈人类实体类〉
 *
 * @author cty
 * @ClassName Person
 * @create 2020-01-08 10:48
 * @Version 1.0.0
 */
public class Person{
    private String name;
    private String male;
    private  Integer age;

    public Person() {
    }

    public Person(String name, String male, Integer age) {
        this.name = name;
        this.male = male;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", male='" + male + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return person.getAge() == this.age && person.getName() == this.name && person.getMale() == this.male;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getMale());
    }
}
