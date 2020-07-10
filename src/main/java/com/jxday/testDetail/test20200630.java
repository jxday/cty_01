package com.jxday.testDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 〈函数式编程〉
 * 〈java的参数传递是值传递而不是引用传递，所以需要返回值〉
 *
 * @author cty
 * @ClassName test20200630
 * @create 2020-06-30 14:18
 * @Version 1.0.0
 */
public class test20200630 {
    public static void main(String[] args) {
        test1();
//        List<Double> doubles = get1();
//        doubles.stream().forEach(System.err::println);
//        List<Integer> integers = get2();
//        integers.stream().forEach(t -> {
//            System.out.println(System.currentTimeMillis()+":当前参数为："+t);
//        });
    }

    private static void test1() {
        Integer sum = 0;
        ArrayList<Integer> doubles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            doubles.add(i + 1);
        }
        System.out.println(doubles.size());
        String param = "-cty";
        final int[] num = {0};
        add(sum, doubles);
        Integer reduce1 = doubles.stream().reduce(0, (sum1, t) -> sum1 += t);
        Integer reduce2 = doubles.stream().peek((m) -> {
//            num[0]++;
//            System.err.println(Thread.currentThread().getName() + param + num[0]);
        }).reduce(0, (sum1, t) -> {
                    num[0]++;
                    System.err.println(Thread.currentThread().getName() + param + num[0]);
                    return sum1 += t;
                },
                (sum2, sum3) -> {
                    System.err.println(Thread.currentThread().getName() + param);
                    return sum2 += sum3;
                });
        System.out.println(sum);
        System.out.println(reduce1);
        System.out.println(reduce2);
    }

    private static void add(Integer sum, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
    }

    private static List<Double> get1() {
        List<Double> collect = Stream.generate(() -> Math.random()).limit(10).collect(Collectors.toList());
        return collect;
    }

    private static List<Integer> get2() {
        List<Integer> collect = Stream.iterate(1, t -> t + 2).limit(10).collect(Collectors.toList());
        return collect;
    }
}
