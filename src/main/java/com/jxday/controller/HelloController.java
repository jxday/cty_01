package com.jxday.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/jxday")
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        BeanUtils.copyProperties(null,null);
        return "Hello Worle!";
    }

    public static void main(String[] args) {
//        Point point = new Point();
//        point.x = 100;
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        long millis = 1584093334L;
//        String format = simpleDateFormat.format(new Date(Long.valueOf(millis + "000000")));
//        System.out.println(Long.valueOf(millis + "000"));
//        System.out.println(format);

//        Animals a = new Animals();
//        a.enjoy();
//        System.out.println(a.age);
//
//        Dogg d = new Dogg();
//        d.enjoy();
//        System.out.println(d.age);

        Animals d1 = new  Dogg();
        d1.enjoy();
        int age1 = d1.getAge();
        System.out.println(age1);
        System.out.println(d1.age);
        
        Dogg s = (Dogg)d1;
        int age2 = s.getAge();
        System.out.println(age2);
        System.out.println(s.age);
    }


    public static class Animals {
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        int age = 10;
        
        void enjoy() {
            System.out.println("Animals enjoy!");
        }

    }

    public static class Dogg extends Animals {
        int age = 20;

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public void setAge(int age) {
            this.age = age;
        }

        void enjoy() {
            System.out.println("Dog enjoy!");
        }
    }
    
    
}
