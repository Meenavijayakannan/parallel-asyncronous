package com.learnjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class NonRepeatedString {
    public static void main(String[] args){
        String val = "Meena";
        char[] chars=val.toCharArray();
        HashMap<Character,Integer> hmap = new LinkedHashMap<>();
        for(int i=0;i<val.length();i++){
            hmap.put(chars[i],hmap.containsKey(chars[i])?hmap.get(chars[i])+1:1);
        }
        Optional<Character> varia = hmap.entrySet().stream().filter(value -> value.getValue() == 1).map(values->values.getKey()).findFirst();
        System.out.println(varia.get());
    }
}
