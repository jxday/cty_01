package com.jxday.desingnPattern.AbstractFactoryPattern;

/**
 * 〈〉
 *
 * @author 汤仁杰
 * @ClassName test
 * @create 2020-11-13 16:36
 * @Version 1.0.0
 */
public class test {
    private static String name = "com.jxday.desingnPattern.AbstractFactoryPattern.symbainFactory";
//    private static String name = "symbainFactory";
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class c=Class.forName(name); 
        phoneHandler factory=(phoneHandler)c.newInstance();
        operatorInter operator = factory.getOperator();
        surfaceInter surface = factory.getSurface();
        operator.start();
        surface.start();

    }
}
