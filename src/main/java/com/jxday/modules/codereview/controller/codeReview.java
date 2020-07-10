package com.jxday.modules.codereview.controller;

import com.jxday.modules.codereview.Interface.Ireview;
import com.jxday.modules.codereview.entity.People;
import org.apache.shiro.util.CollectionUtils;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Maps;

import java.util.*;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName codeReview
 * @create 2020-01-13 15:07
 * @Version 1.0.0
 */
public class codeReview{
    public static void main(String[] args) {
//        List<String> list = Lists.newArrayList();
//        Map<String, Object> map = Maps.newHashMap("",null);
//        boolean empty = CollectionUtils.isEmpty(list);
//        boolean aNull = Objects.isNull(null);
//        System.out.println(empty);
//        People people = new People();
//        if (isKids(people)){
//            
//        }
//        System.out.println(getPeople().orElse(People.ofName("cty")));
        People people = People.ofName("cty");
        System.out.println(people);
        change(people);
        System.out.println(people);
        System.out.println("==============");
        String s = "cty";
        System.out.println(s);
        change(s);
        System.out.println(s);
        System.out.println("==============");
        int a = 50000;
        System.out.println(a);
        change(a);
        System.out.println(a);
        System.out.println("==============");
        Double d = 20D;
        System.out.println(d);
        change(d);
        System.out.println(d);
    }

    private static boolean isKids(People people) {
        return people.getAge() == 0;
    }

    public static Optional<People> getPeople(){
        return Optional.ofNullable(People.ofName("ldd"));
    }
    
    public static void change(People people){
        people = getPeople().get();
    }

    public static void change(String s){
        s = "ldd";
    }

    public static void change(int s){
        s = 10000;
    }

    public static void change(Double s){
        s = 200D;
    }
}
