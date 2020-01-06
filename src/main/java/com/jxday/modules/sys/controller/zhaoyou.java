package com.jxday.modules.sys.controller;

import com.alibaba.fastjson.JSON;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 〈找油网接口请求〉
 *
 * @author cty
 * @ClassName zhaoyou
 * @create 2019-11-08 16:01
 * @Version 1.0.0
 */
public class zhaoyou extends AbstractController{

    public static void main(String[] args) {
        test3();
    }

    private static void test3() {
        Map<String, Objects> map = new HashMap<String, Objects>();
        String myLat = (String) null;
        System.out.println(myLat);

    }


    public static void test2() {
        String s = "aaaa,ssss,dddd，ffff,gggg";
        String[] split = s.split(",|，");
        System.out.println(JSON.toJSONString(split));
    }
    
    public static void test1(String[] args) {
        ArrayList<String> list = getList();
//        System.out.println(list.isEmpty());
        System.out.println(Objects.isNull(list));
    }
    
    public static ArrayList<String> getList(){
        return null;
    }
    
}
