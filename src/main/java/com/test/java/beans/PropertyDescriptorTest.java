package com.test.java.beans;

import com.test.java.entity.Person;
import com.test.java.entity.Teacher;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;


/**
 * 〈PropertyDescriptor的测试类〉
 *
 * @author cty
 * @ClassName PropertyDescriptorTest
 * @create 2020-01-08 10:46
 * @Version 1.0.0
 */
public class PropertyDescriptorTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aaa");
        person.setAge(11);
        Teacher teacher = new Teacher();
//        teacher.setAge(10);
//        teacher.setKemu("math");
        BeanUtils.copyProperties(person,teacher);
        System.out.println(teacher);
    }
    
    private void test1(){
        Person person = new Person();
        person.setName("aaa");
        person.setAge(11);
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(person,teacher);
        System.out.println(teacher);
    }
    
    private void test2(){
        try {
            Person test1 = new Person();
            test1.setName("vvvv");
            test1.setAge(18);
            test1.setMale("male");
            PropertyDescriptor pd = new PropertyDescriptor("name", test1.getClass());
            Method readMethod = pd.getReadMethod();
            Object invoke = readMethod.invoke(test1);
            System.out.println(invoke);

            Class<?> propertyType = pd.getPropertyType();
            System.out.println(propertyType);

            Method setMethod = pd.getWriteMethod();  // 还有与Wirte方法对应的Read方法
            setMethod.invoke(test1, "bbbbb");
            System.out.print(test1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
