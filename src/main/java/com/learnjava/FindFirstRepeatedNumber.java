package com.learnjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstRepeatedNumber {
    public static void main(String arg[]){
        HashMap<Integer,Integer> hashMap = new LinkedHashMap();
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        for(int a : arr){
            hashMap.put(a , hashMap.containsKey(a)?hashMap.get(a)+1:1);
        }
        Optional<Integer> first = hashMap.entrySet().stream().filter(a -> a.getValue() == 2).map(a->a.getKey()).findFirst();
        System.out.println(first.get());
        for(Map.Entry<Integer, Integer> entry :hashMap.entrySet()){
            if(entry.getValue() == 2){
                System.out.println(entry.getKey());
                break;
            }
        }
        //firstnonrepeated
        System.out.println(hashMap.entrySet().stream().filter(a->a.getValue() ==1).map(a->a.getKey()).findFirst().get());
    }
}
