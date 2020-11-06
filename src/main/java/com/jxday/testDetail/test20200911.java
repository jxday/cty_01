package com.jxday.testDetail;

/**
 * 〈jhsdb测试〉
 *
 * @author cty
 * @ClassName test20200911
 * @create 2020-09-11 13:51
 * @Version 1.0.0
 */
public class test20200911 {
    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
    
    private static class ObjectHolder{}
    
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();
        void foo(){
            ObjectHolder holder = new ObjectHolder();
            System.out.println("1");
        }
    }
}
