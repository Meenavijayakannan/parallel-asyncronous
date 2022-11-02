package com.learnjava;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOccurence {
    public static void main(String[] args){
        String val="aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
        char[] chars = val.toCharArray();
        HashMap<Character,Integer> hmap = new LinkedHashMap();
        for(char c:chars){
            hmap.put(c,hmap.containsKey(c)?hmap.get(c)+1:1);
        }
        Character res = hmap.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).map(vals->vals.getKey()).findFirst().get();
        System.out.println(res);
    }
}
