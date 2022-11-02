package com.learnjava;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortByValues {
    public static void main(String args[]){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Meena",4);
        hashMap.put("Meen",2);
        hashMap.put("Mee",1);
        hashMap.put("Mena",3);
        Map<String,Integer> tempMap= hashMap.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));

        LinkedList<Map.Entry<String,Integer>> list = new LinkedList(hashMap.entrySet());
        Collections.sort(list,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
        HashMap<String,Integer> hmap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            hmap.put(entry.getKey(),entry.getValue());
        }

        for(Map.Entry entry:hmap.entrySet()){
            System.out.println(entry.getKey()+ "="+ entry.getValue());
        }

        for(Map.Entry entry:tempMap.entrySet()){
            System.out.println("Java 8"+entry.getKey()+ "="+ entry.getValue());
        }
    }
}
