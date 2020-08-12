package com.jxday.testDetail;

import com.test.java.entity.Person;

/**
 * 〈try/catch/finally中存在return时的执行顺序〉
 *      1、不管有没有出现异常，finally块中代码都会执行；
 *      2、当try和catch中有return时，finally仍然会执行；
 *      3、finally是在return后面的表达式运算后执行的（此时并没有返回运算后的值，而是先把要返回的值保存起来（浅拷贝/值传递），不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值），所以函数返回值是在finally执行前确定的；
 *      4、finally中最好不要包含return，否则程序会提前退出，返回值不是try或catch中保存的返回值。
 * @author cty
 * @ClassName test20200708
 * @create 2020-07-08 16:54
 * @Version 1.0.0
 */
public class test20200708 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        person = test(person);
        System.out.println(person);

        System.out.println(testString());
    }
    
    public static Person test(Person person){
        try {
            person.setAge(10);
            return person.setAge(15);
        }finally {
            person.setAge(20);
        }
    }
    
    public static String testString(){
        String s = "aaa";

        try {
            s =  "bbb";
            return s = "ccc";
        }finally {
//            s = "ddd";
            return s = "ddd";
        }
    }
}
