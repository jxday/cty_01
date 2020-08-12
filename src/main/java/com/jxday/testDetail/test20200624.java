package com.jxday.testDetail;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈动态代理〉
 *
 * @author cty
 * @ClassName test20200624
 * @create 2020-06-24 11:41
 * @Version 1.0.0
 */
public class test20200624 {
    static interface IService {
        public void sayHello();
        public void sayHello1();
    }
    static class RealService1 implements IService {
        @Override
        public void sayHello() {
            System.out.println("hello111");
        }

        @Override
        public void sayHello1() {
            System.out.println("1");
        }
    }

    static class RealService2 implements IService {
        @Override
        public void sayHello() {
            System.out.println("hello222");
        }

        @Override
        public void sayHello1() {
            String name = this.getClass().getClassLoader().getClass().getName();
            System.out.println(name);
        }
    }
    static class SimpleInvocationHandler implements InvocationHandler {
        private Object realObj;
        public SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }
        public Object bind(Object delegate) {
            this.realObj = delegate;
            return Proxy.newProxyInstance(this.realObj.getClass().getClassLoader(), this.realObj.getClass().getInterfaces(), this);
        }
        @Override
        public Object invoke(Object proxy, Method method,
                             Object[] args) throws Throwable {
            System.out.println("entering " + method.getName());
            Object result = method.invoke(realObj, args);
            System.out.println("leaving " + method.getName());
            return result;
        }
    }
    public static void main(String[] args) {
        IService realService1 = new RealService1();
        IService realService2 = new RealService2();
        IService realService = new RealService2();
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class<?>[] { IService.class }, new SimpleInvocationHandler(realService));
//        System.out.println(realService.getClass());
//        System.out.println(proxyService.getClass());
        proxyService.sayHello();
        proxyService.sayHello1();

//        SimpleInvocationHandler handler = new SimpleInvocationHandler();
//        IService bind1 =(IService)handler.bind(realService1);
//        bind1.sayHello();
//        
//        IService bind2 =(IService)handler.bind(realService2);
//        bind1.sayHello();
//        bind2.sayHello();
//
//        Enhancer enhancer = new Enhancer();

    }

}
