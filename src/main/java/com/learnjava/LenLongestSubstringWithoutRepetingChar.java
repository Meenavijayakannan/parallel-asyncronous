package com.learnjava;

import java.util.HashMap;
import java.util.Map;

public class LenLongestSubstringWithoutRepetingChar {
    public static void main(String[] args){
        String s ="abcdabc";
        int start =0,len=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(map.containsKey(c)){
                if(start <=map.get(c)){
                    start=map.get(c)+1;
                }
            }
            len=Math.max(len,end-start+1);
            map.put(c,end);
        }
        System.out.println(len);
    }
}
