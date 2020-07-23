package com.test.java;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.java.entity.Person;
import org.springframework.util.ClassUtils;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName cty
 * @create 2020-03-21 13:55
 * @Version 1.0.0
 */
public class cty {
    public static void main(String[] args) {
        assert test() == 1: "不是1";
        System.out.println(new SimpleDateFormat().format(new Date(System.currentTimeMillis())));
    }
    
    public static int test(){
        return 11;
    }       
    
}
