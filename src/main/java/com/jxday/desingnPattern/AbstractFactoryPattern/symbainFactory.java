package com.jxday.desingnPattern.AbstractFactoryPattern;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName symbainFactory
 * @create 2020-11-13 16:33
 * @Version 1.0.0
 */
public class symbainFactory implements phoneHandler {
    @Override
    public operatorInter getOperator() {
        return new symbainOperatorController();
    }

    @Override
    public surfaceInter getSurface() {
        return new symbainSurfaceController();
    }
}
