package com.jxday.testDetail;

import java.util.*;

/**
 * 〈leetcode179〉           做错了
 *
 * @author cty
 * @ClassName test20200519
 * @create 2020-05-19 19:16
 * @Version 1.0.0
 */
public class test20200519 {
    public static void main(String[] args) {
        int[] ints ={2,22,222,2223,2222,2221,9,95,12};
        System.out.println(largestNumber(ints));
    }
    public static String largestNumber(int[] nums) {
        String result = "";
        HashMap<String, List<char[]>> totalValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i]+"";
            char[] chars = num.toCharArray();
            String firstChar = chars[0]+"";
            List<char[]> list = totalValues.get(firstChar);
            if (list == null){
                list = new ArrayList<>();
                list.add(chars);
                totalValues.put(firstChar,list);
            }else {
                list.add(chars);
            }
        }

        Set<String> strings = totalValues.keySet();
        ArrayList<String> arrayList = new ArrayList<>(strings);
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toCharArray()[0] - o1.toCharArray()[0];
            }
        });
        for (String s : arrayList) {
            List<char[]> chars = totalValues.get(s);
            chars.sort(new Comparator<char[]>() {
                @Override
                public int compare(char[] o1, char[] o2) {
                    int max = o1.length > o2.length ? o1.length : o2.length;
                    for (int i = 0; i < max; i++) {
                        char char1;
                        char char2;
                        char1 = i > o1.length - 1 ? o1[0] : o1[i];
                        char2 = i > o2.length - 1 ? o2[0] : o2[i];
                        if (char1 == char2){
                            continue;
                        }
                        return char2 - char1;
                    }
                    return 0;
                }
            });
            for (char[] aChar : chars) {
                String s1 = new String(aChar);
                result += s1;
            }
        }
        System.out.println(result);
        return result;
    }
}
