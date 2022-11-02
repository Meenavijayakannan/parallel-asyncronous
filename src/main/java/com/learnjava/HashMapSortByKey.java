package com.learnjava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortByKey {
    public static void main(String args[]){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Meena",4);
        hashMap.put("Bala",2);
        hashMap.put("Vijay",1);
        hashMap.put("Sidh",3);
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        for(Map.Entry entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
