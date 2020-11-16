package com.jxday.desingnPattern.PrototypeManager;

import java.util.HashMap;

/**
 * 〈    通过原型工厂，以浅拷贝的形式，实现对功能接口的创建   〉
 *
 * @author 汤仁杰
 * @ClassName PrototypeManager
 * @create 2020-11-16 14:23
 * @Version 1.0.0
 */
public class PrototypeManager {
    private HashMap<String,Prototype> params = new HashMap<>();
    private static PrototypeManager manager= new PrototypeManager();
    
    public Prototype getPrototype(String key){
        Prototype prototype = params.get(key);
        Prototype clone = prototype.clone();
        return clone;
    }
    
    public Prototype setPrototype(String key,Prototype value){
        Prototype put = params.put(key,value);
        return put;
    }
    
    public static PrototypeManager getManager(){
        return manager;
    }

    public static void main(String[] args) {
        PrototypeManager manager = PrototypeManager.getManager();
        manager.setPrototype("monkey",new MonkeyPrototype());

        Prototype monkey1 = manager.getPrototype("monkey");
        Prototype monkey2 = manager.getPrototype("monkey");
        monkey1.display();
        monkey2.display();
        System.out.println(monkey1 == monkey2);
    }
}
