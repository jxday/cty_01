package com.geekbang.ioc.java.beans;

import lombok.SneakyThrows;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;


/**
 * {@link java.beans.BeanInfo} 实例
 * 〈〉
 *
 * @author cty
 * @ClassName BeanInfoDemo
 * @create 1/23/21 4:52 PM
 * @Version 1.0.0
 */
public class BeanInfoDemo {
    
    
    @SneakyThrows
    public static void main(String[] args) {

        //第二个参数：stopClass，获取class property的时候，向上追溯到哪个父类为止，注意Object有个getClass方法也会被认为时readMethod
        BeanInfo info = Introspector.getBeanInfo(Person.class,Object.class);
        Stream.of(info.getPropertyDescriptors()).forEach(
                propertyDescriptor -> {
                    System.out.println(propertyDescriptor);
                    
                    //PropertyDescriptor 允许添加属性编辑器  PropertyEditor
                    //GUI   -》 test(String)     ->  PropertyType
                    //name  String
                    //age   Integer
                    Class<?> propertyType = propertyDescriptor.getPropertyType();
                    String name = propertyDescriptor.getName();
                    if ("age".equals(name)){    //为age  字段/属性   添加PropertyEditor
                        propertyDescriptor.setPropertyEditorClass(StringToIntegerPropertyEditor.class);
//                        Class<?> propertyEditorClass = propertyDescriptor.getPropertyEditorClass();
                    }

                }
        );
    }   
     
    static class StringToIntegerPropertyEditor extends PropertyEditorSupport{
        
        @Override
        public void setAsText(String text) throws java.lang.IllegalArgumentException {
            setValue(Integer.valueOf(text));
        }
    }
}
