package com.learnjava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckListContainsOdd {
    public static void main(String args[]){
        List<Integer> list = IntStream.range(1,11).boxed().collect(Collectors.toList());
        Boolean result =list.stream().anyMatch(n -> n%2 ==0);
        if(result == true){
            System.out.println("List contains Even numbers");
        }
    }
}
