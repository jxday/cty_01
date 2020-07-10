package com.jxday.testDetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jxday.common.utils.ReadUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200522
 * @create 2020-05-22 12:18
 * @Version 1.0.0
 */
public class test20200522 {
    public static void main(String[] args) {
        String s = ReadUtil.readFileContent("/Users/cty/代码库/jxday_web_01/src/main/resources/testFile/t1");
        String s2 = ReadUtil.readFileContent("/Users/cty/代码库/jxday_web_01/src/main/resources/testFile/t2");
        
        List<TtmsOrderPackPrice> t1 = t1(s);
        List<TtmsOrderPackPrice> t2 = t1(s2);
        ArrayList<Object> objects = new ArrayList<>();
        t1.removeAll(t2);

        System.out.println(JSONArray.toJSONString(t1));
        
        
    }

    public static List<TtmsOrderPackPrice> t1 (String s) {
        JSONObject jsonObject = JSON.parseObject(s);
        JSONObject body = jsonObject.getJSONObject("body");
        JSONArray jsonArray = body.getJSONArray("elements");
        List<TtmsOrderPackPrice> prices = JSON.parseArray(jsonArray.toJSONString(), TtmsOrderPackPrice.class);
        return prices;
    }
}
