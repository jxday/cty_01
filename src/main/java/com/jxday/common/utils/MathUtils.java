package com.jxday.common.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 〈算数工具类〉
 *
 * 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精
 * 确的浮点数运算，包括加减乘除和四舍五入。
 * 
 * @author cty
 * @ClassName MathUtils
 * @create 2019-11-15 17:13
 * @Version 1.0.0
 */
public class MathUtils {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    //这个类不能够被实例化
    private MathUtils() {
    }
    
    private BigDecimal getHailEven(double number){
        BigDecimal bigDecimal = new BigDecimal(number);
        BigDecimal decimal = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(decimal);
        return decimal;
    }
}
