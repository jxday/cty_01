package com.jxday.testDetail;

import sun.misc.VM;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200429
 * @create 2020-04-29 16:12
 * @Version 1.0.0
 */
public class test20200429 {
    public static void main(String[] args) {
        String property = VM.getSavedProperty("");
        System.out.println(property);
    }
}
