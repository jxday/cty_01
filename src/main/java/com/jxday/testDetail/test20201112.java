package com.jxday.testDetail;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20201112
 * @create 2020-11-12 15:48
 * @Version 1.0.0
 */
public class test20201112 {

    public static void main(String[] args) {

        int code = 0;
        String addCode = "00000";


        for (int i = 0; i < 10000; i++) {

            code = Integer.parseInt(addCode);
            // 00001自增之后是2，所以这是一行高位补零的代码
            addCode = String.format("%05d", ++code);
            System.out.println(addCode);
        }
    }
    
    public void test1(){

//        URL url1 = new URL("");
        Proxy noProxy = Proxy.NO_PROXY;
//        InetSocketAddress inetSocketAddress = new InetSocketAddress();
//        Proxy proxy = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
//        URLConnection urlConnection = url1.openConnection(proxy);
    }
}
