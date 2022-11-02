package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayCompare {
    public static void main(String[] args){
        int[] arrayValue1 = {1,3,4,7,8};
        int[] arrayValue2 = {3,4};

        List firstList = Arrays.stream(arrayValue1).boxed().collect(Collectors.toList());
        List secondList = Arrays.stream(arrayValue2).boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>(firstList);
        resultList.removeAll(secondList);
        resultList.stream().distinct().forEach(System.out::println);
    }
}
