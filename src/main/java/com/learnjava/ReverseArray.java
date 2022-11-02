package com.learnjava;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,2};
        ArrayUtils.reverse(arr);
        for(int a : arr){
            System.out.println(a);
        }
        Arrays.stream(ArrayUtils.removeElement(arr,2)).forEach(System.out::println);
        int arr1[] = {1,2,3,4,5,6,7,8,9,2};
        List list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println("i"+i));
    }
}
