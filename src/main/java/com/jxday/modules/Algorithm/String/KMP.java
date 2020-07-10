package com.jxday.modules.Algorithm.String;

import java.sql.Array;

/**
 * 〈KMP算法，解决字符串回溯问题〉
 *
 * @author cty
 * @ClassName KMP
 * @create 2020-02-27 16:26
 * @Version 1.0.0
 */
public class KMP {
    public static void main(String[] args) {
        int[] next = {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        String[] t = {"a","b","a","b","a","a","a","b","a","b","a","a"};
        String s = "ababaaababaa";
//        getNext(next,t);
        getNext1(next,s);
    }
    public static void getNext(int next[],String t[])
    {
        int j=0,k=-1;
        next[0]=-1;
        while(j<t.length-1)
        {
            if(k == -1 || t[j] == t[k])
            {
                j++;k++;
                next[j] = k;
            }
            else k = next[k];//此语句是这段代码最反人类的地方，如果你一下子就能看懂，那么请允许我称呼你一声大神！
        }
//        -100123112345-2
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]);
        }
    }

    public static void getNext1(int next[],String t)
    {
        int j=0,k=-1;
        next[0]=-1;
        while(j<t.length()-1)
        {
            if(k == -1 || t.charAt(j) == t.charAt(k))
            {
                j++;k++;
                next[j] = k;
            }
            else k = next[k];//此语句是这段代码最反人类的地方，如果你一下子就能看懂，那么请允许我称呼你一声大神！
        }
//        -100123112345-2
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i]);
        }
    }
}
