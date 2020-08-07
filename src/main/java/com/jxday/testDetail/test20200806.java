package com.jxday.testDetail;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * 〈递归打印〉
 *
 * @author cty
 * @ClassName test20200806
 * @create 2020-08-06 18:00
 * @Version 1.0.0
 */
public class test20200806 {
    
    private static int total;
    
    public static void main(String[] args) {
        test1();
        System.err.println(total);
        System.err.println(5*5*5*5*5);
    }

    private static void test1() {
        int[] arr = {0,0,0,0,0};
        printArr(arr,0);
        
    }

    private static void printArr(int[] arr, int i) {
        if (i == 5){
            total++;
            System.out.print(arr[0]+"  ");
            System.out.print(arr[1]+"  ");
            System.out.print(arr[2]+"  ");
            System.out.print(arr[3]+"  ");
            System.out.println(arr[4]);
        }else {
            for (int j = 0; j < 5; j++) {
                int[] _arr = arr;
                _arr[i] = j;
                printArr(_arr,i+1);
            }
        }
    }


}
