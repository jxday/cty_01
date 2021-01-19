package com.jxday;

import com.jxday.modules.codereview.entity.People;
import com.jxday.testDetail.test20210119;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportResource(value = "classpath:spring.xml")
public class HelloWorldApplication {
    public static void main(String[] args) {

        //spring应用启动
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
