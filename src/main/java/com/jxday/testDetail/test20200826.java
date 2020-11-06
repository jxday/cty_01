package com.jxday.testDetail;

import com.test.java.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈jvm〉
 *
 * @author cty
 * @ClassName test20200826
 * @create 2020-08-26 14:02
 * @Version 1.0.0
 */
public class test20200826 {
    
    private Person person = new Person();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }

    }
}
