package com.jxday.testDetail;

import java.io.IOException;
import java.io.InputStream;

/**
 * 〈分别使用 自定义类加载器 和 系统类加载器 创建实例〉
 *
 * @author cty
 * @ClassName test20200915
 * @create 2020-09-15 16:59
 * @Version 1.0.0
 */
public class test20200915 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = new ClassLoader(){
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException{
                try {
                    String s = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    /**
                     * 调用方法 loadClass("com.jxday.testDetail.test20200915")
                     * name是 : com.jxday.testDetail.test20200915
                     * s是 : test20200915.class
                     * name是 : java.lang.Object
                     * s是 : Object.class
                     */
                    System.out.println("name是 : "+ name);
                    System.out.println("s是 : "+ s);
                    
                    InputStream stream = getClass().getResourceAsStream(s);
                    if (stream == null){
                        return super.loadClass(name);
                    }
                    byte[] bytes = new byte[stream.available()];
                    stream.read(bytes);
                    //把字节数组 b 中的内容转换成 Java 类，返回的结果是 java.lang.Class 类的实例。这个方法被声明为 final 的。
                    return defineClass(name,bytes,0,bytes.length);
                } catch (IOException a){
                    throw new ClassNotFoundException(name);                    
                }
            }
        };

        Object instance = classLoader.loadClass("com.jxday.testDetail.test20200915").newInstance();
        Object instance2 = ClassLoader.getSystemClassLoader().loadClass("com.jxday.testDetail.test20200915").newInstance();

        System.out.println(instance.getClass());
        System.err.println(instance2.getClass());

        System.out.println(instance instanceof com.jxday.testDetail.test20200915);
        System.err.println(instance2 instanceof com.jxday.testDetail.test20200915);
        
    }
}
