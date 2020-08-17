package com.jxday.testDetail;

import ch.qos.logback.classic.LoggerContext;
import com.test.java.entity.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * 〈logpack〉
 *
 * @author cty
 * @ClassName test20200812
 * @create 2020-08-12 11:17
 * @Version 1.0.0
 */
public class test20200812 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("PROJECT_LOGGER");
        logger.info("hello world");
        try {
            Object bean = BeanUtils.cloneBean(new Person());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
//        LoggerContext
    }
}
