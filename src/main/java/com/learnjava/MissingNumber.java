package com.learnjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String args[]){
        int arr[]={1,2,3,6,8,9,10};
        List<Integer> arraylist = IntStream.of(arr).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
                if (!arraylist.contains(i+1)) {
                    list.add(i + 1);
                }
        }
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
