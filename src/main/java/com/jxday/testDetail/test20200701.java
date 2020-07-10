package com.jxday.testDetail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200701
 * @create 2020-07-01 15:26
 * @Version 1.0.0
 */
public class test20200701 {
    private static final Logger log = LoggerFactory.getLogger(test20200701.class);

    public static void main(String[] args) {
//        t1();
        t2();
    }

    private static void t2() {
        LocalDateTime now = LocalDateTime.now();
//        2020-07-01T15:29:00.604
        log.info(now.toString());

        LocalDateTime time = LocalDateTime.of(2020, 07, 01, 12, 00, 01);
//        2020-07-01T12:00
        log.info(time.toString());
        log.info(time.toLocalTime().toString());

        DayOfWeek dayOfWeek = time.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfYear());
//        WEDNESDAY
//        1
//        183
    }

    private static void t1() {
        Instant now = Instant.now();
        //2020-07-01T07:26:59.523Z
        System.out.println(now);

        Instant milli = Instant.ofEpochMilli(System.currentTimeMillis());
        //2020-07-01T07:26:59.523Z
        System.out.println(milli);
    }
}
