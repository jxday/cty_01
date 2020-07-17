package com.jxday.testDetail;

/**
 * 〈逻辑运算符〉
 *
 * @author cty
 * @ClassName test20200716
 * @create 2020-07-16 16:06
 * @Version 1.0.0
 */
public class test20200716 {
    public static void main(String[] args) {
        //逻辑与
        System.out.println(1&1);      //1
        System.out.println(1&0);      //0
        System.out.println(0&0);      //0

        //逻辑异或
        System.out.println(1^1);      //0
        System.out.println(1^0);      //1
        System.out.println(0^0);      //0

        //逻辑或
        System.out.println(1|1);      //1
        System.out.println(1|0);      //1
        System.out.println(0|0);      //0

    }
}
