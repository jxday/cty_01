package com.jxday.testDetail;

import org.python.util.PythonInterpreter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20210204
 * @create 2/4/21 4:25 PM
 * @Version 1.0.0
 */
public class test20210204 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        PythonInterpreter interpreter = new PythonInterpreter();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        interpreter.exec("a='hello world'; ");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        interpreter.exec("print a;");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));

    }

}
