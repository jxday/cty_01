package com.jxday.testDetail;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * 〈注解/注解使用/自定义注解/定制序列化〉
 *
 * @author cty
 * @ClassName t1
 * @create 2020-06-23 15:03
 * @Version 1.0.0
 */
public class test20200623 {
    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface QueryParam {
        String value();
    }
    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface DefaultValue {
        String value() default "";
    }
    public void hello(@QueryParam("action") String action,
                      @QueryParam("sort") @DefaultValue("asc") String sort){
        System.out.println("2222");
    }

    public void hello(){
        System.out.println("11111");
    }
    
    public static void main1(String[] args) throws Exception {
        Class<?>cls = test20200623.class;
        Method method = cls.getMethod("hello", new Class[]{String.class, String.class});
        Method method1 = cls.getMethod("hello");

        method.invoke(new test20200623(),"","");
        method1.invoke(new test20200623());
        Annotation[][] annts = method.getParameterAnnotations();
        
        for(int i=0; i<annts.length; i++){
            System.out.println("annotations for paramter " + (i+1));
            
            Annotation[] anntArr = annts[i];
            for(Annotation annt : anntArr){
                if(annt instanceof QueryParam){
                    QueryParam qp = (QueryParam)annt;
                    System.out.println(qp.annotationType().getSimpleName()+":"+ qp.value());
                    
                }else if(annt instanceof DefaultValue){
                    DefaultValue dv = (DefaultValue)annt;
                    System.out.println(dv.annotationType().getName()+":"+ dv.value());
                    System.out.println(dv.annotationType().getSimpleName()+":"+ dv.value());
                    
                }
            }
        }
    }

    @Retention(RUNTIME)
    @Target(FIELD)
    public @interface Label {
        String value() default "";
    }
    @Retention(RUNTIME)
    @Target(FIELD)
    public @interface Format {
        String pattern() default "yyyy-MM-dd HH:mm:ss";
        String timezone() default "GMT+8";
    }

    static class Student{
        @Label("姓名")
        String name;
        @Label("出生日期")
        @Format(pattern = "yyyy/MM/dd")
        Date born;
        @Label("分数")
        double score;

        public Student(String name, Date born, double score) {
            this.name = name;
            this.born = born;
            this.score = score;
        }

        //其他代码
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Student zhangsan = new Student("张三", sdf.parse("1990-12-12"), 80.9d);
            System.out.println(format(zhangsan));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

        public static String format(Object obj) {
        try {
            Class<?>cls = obj.getClass();
            StringBuilder sb = new StringBuilder();
            for(Field f : cls.getDeclaredFields()) {
                if(! f.isAccessible()) {
                    f.setAccessible(true);
                }
                Label label = f.getAnnotation(Label.class);
                String name = label != null ? label.value() : f.getName();
                Object value = f.get(obj);
                if(value != null && f.getType() == Date.class) {
                    value = formatDate(f, value);
                }
                sb.append(name + ":" + value + "\n");
            }
            return sb.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object formatDate(Field f, Object value) {
        Format format = f.getAnnotation(Format.class);
        if(format != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format.pattern());
            sdf.setTimeZone(TimeZone.getTimeZone(format.timezone()));
            return sdf.format(value);
        }
        return value;
    }


}
