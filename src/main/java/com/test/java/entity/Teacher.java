package com.test.java.entity;

/**
 * 〈教师实体类〉
 *
 * @author cty
 * @ClassName Teacher
 * @create 2020-01-08 10:48
 * @Version 1.0.0
 */
public class Teacher extends Person {
    private Integer year;
    private String Kemu;

    public Teacher() {
        super();
    }

    public Teacher(String name, String male, Integer age, Integer year, String kemu) {
        super(name, male, age);
        this.year = year;
        Kemu = kemu;
    }
    
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getKemu() {
        return Kemu;
    }

    public void setKemu(String kemu) {
        Kemu = kemu;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "year=" + year +
                ", Kemu='" + Kemu + '\'' +
                "name='" + getName() + '\'' +
                ", male='" + getMale() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
