package com.jxday.testDetail;

import java.lang.invoke.MethodHandle;
import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.MethodType;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200917
 * @create 2020-09-17 15:05
 * @Version 1.0.0
 */
public class test20200917 {
    static class classA{
        public void println(String s){
            System.out.println(s);
        }
    }
    public static void main(String[] args) throws Throwable {
        Object o = System.currentTimeMillis() % 2 == 0 ? System.out : new classA();
        getPrintlnMH(o).invokeExact("aaaa");
    }

    private static MethodHandle getPrintlnMH(Object o) throws NoSuchMethodException, IllegalAccessException {
        MethodType methodType = MethodType.methodType(void.class, String.class);
        return lookup().findVirtual(o.getClass(),"println",methodType).bindTo(o);
    }
}
