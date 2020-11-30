package com.jxday.desingnPattern.AbstractFactoryPattern;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName symbainSurfaceController
 * @create 2020-11-13 16:35
 * @Version 1.0.0
 */
public class symbainSurfaceController implements surfaceInter {
    @Override
    public void start() {
        System.out.println(symbainSurfaceController.class.getSimpleName()+"          start!");
    }
}
