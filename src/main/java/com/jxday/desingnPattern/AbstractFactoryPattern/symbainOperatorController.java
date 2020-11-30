package com.jxday.desingnPattern.AbstractFactoryPattern;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName symbainOperatorController
 * @create 2020-11-13 16:33
 * @Version 1.0.0
 */
public class symbainOperatorController implements operatorInter {
    @Override
    public void start() {
        System.out.println(symbainOperatorController.class.getName()+"        start");
    }
}
