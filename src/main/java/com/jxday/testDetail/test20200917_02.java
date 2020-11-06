package com.jxday.testDetail;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200917_02
 * @create 2020-09-17 15:32
 * @Version 1.0.0
 */
public class test20200917_02 {
    class GrandFather{
        public void think(){
            System.out.println("GrandFather");
        }
    }

    class Father extends GrandFather{
        public void think(){
            System.out.println("Father");
        }
    }
    
    class Son extends Father{
        public void think(){
            try {
                MethodType methodType = MethodType.methodType(void.class);
                Field implLookup = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                implLookup.setAccessible(true);
                MethodHandle methodHandle = ((MethodHandles.Lookup) implLookup.get(null)).findSpecial(GrandFather.class, "think", methodType, GrandFather.class);
                methodHandle.invoke(this);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        (new test20200917_02().new Son()).think();
    }
    
}
