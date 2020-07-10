package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200516
 * @create 2020-05-16 10:46
 * @Version 1.0.0
 */
public class test20200516 {
    public static void main(String[] args) {
        test1();

    }

    public static void test1() {
        List<? extends Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();


        Integer aa = 2;
//        numbers.add(1);
//        numbers.add(aa);
        integers.add(1);

        numbers = integers;
        integers.add(aa);
        integers.add(100);
        integers.add(22);
        System.out.println(numbers);
//        numbers.addAll(integers);
        Integer max = max(integers);
//        max(numbers);
        System.out.println(max);


    }

    public static void test2() {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();


        Integer aa = 2;
        numbers.add(1);
        numbers.add(aa);
        integers.add(1);
        integers.add(aa);

        numbers.addAll(integers);

        max(integers);
//        max(numbers);

    }
    
    public static <T extends Comparable<T>> T max(List<T> arr){
        T max = arr.get(0);
        for(int i=1; i < arr.size(); i++){
            if(arr.get(i).compareTo(max)>0){
                max = arr.get(i);
            }
        }
        return max;
    }

}