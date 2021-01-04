package com.jxday.testDetail;

import java.beans.Beans;
import java.io.IOException;

/**
 * 〈类创建/失败〉
 *  todo    使用Beans类创建实体
 * @author cty
 * @ClassName test20201211
 * @create 12/11/20 4:45 PM
 * @Version 1.0.0
 */
public class test20201211 {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        test20201211 t = new test20201211();
//        t.test1();
//        Object o = Beans.instantiate(, "People");
//        System.out.println(o);
    }

    
    
    public void test1() throws IOException, ClassNotFoundException {
        Object o = Beans.instantiate(this.getClass().getClassLoader(), "People");
        System.out.println(o);
    }
}
