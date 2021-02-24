package com.jxday.testDetail;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * 〈leetcode 3 
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。〉
 *
 * @author cty
 * @ClassName test20210203_1
 * @create 2/3/21 10:36 AM
 * @Version 1.0.0
 */
public class test20210203_1 {
    public static void main(String[] args) {
        int abba = Solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(abba);
    }
    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            byte[] bytes = s.getBytes();
            int begin = 0;
            int max = 0;
            int length = 0;
            HashMap<Byte, Integer> map = new HashMap<>();
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                Integer index = map.get(b);
                if (Objects.nonNull(index) && index >= begin){
                    length = i - index;
                    begin = index;
                }else {
                    length ++;
                }
                map.put(b,i);
                max = length > max ? length :max;
                System.out.println(length);
            }
            return max;
        }
    }
}
