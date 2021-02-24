package com.jxday.testDetail;

import com.test.java.entity.Person;
import lombok.SneakyThrows;
import sun.misc.SharedSecrets;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210220
 * @create 2/20/21 9:19 AM
 * @Version 1.0.0
 */
public class test20210220 {
    @SneakyThrows
    public static void main(String[] args) {
        List list1 = Collections.synchronizedList(new ArrayList());

//        SharedSecrets.getJavaOISAccess().checkArray(null,null,1);
        
        
        Person lokesh = new Person( "Lokesh", "Gupta",1);
        Person brian = new Person( "Brian", "Clooney",2);
        Person alex = new Person( "Alex", "Kolen",2);

        //Add some random persons
        Collection<Person> list = Arrays.asList(lokesh,brian,alex,lokesh,brian,lokesh);

        // Get distinct objects by key
        List<Person> distinctElements = list.stream()
//                .filter( distinctByKey(p -> p.getAge()) )
                .filter( distinctByKey(p -> p.getAge()) )
                .collect( Collectors.toList() );

        // Let's verify distinct elements
        System.out.println( distinctElements );
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    
    
}
