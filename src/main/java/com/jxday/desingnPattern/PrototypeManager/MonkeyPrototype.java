package com.jxday.desingnPattern.PrototypeManager;

/**
 * 〈〉
 *
 * @author 汤仁杰
 * @ClassName MonkeyPrototype
 * @create 2020-11-16 14:44
 * @Version 1.0.0
 */
public class MonkeyPrototype implements Prototype {
    
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try { 
            prototype = (Prototype)super.clone(); 
        } catch(CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        } 
        return prototype;
    }

    @Override
    public void display() {
        System.out.println("this is a monkey!");
    }
}
