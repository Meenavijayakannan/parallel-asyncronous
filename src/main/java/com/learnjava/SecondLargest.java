package com.learnjava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args){
        int[] array={2,8,3,6,7};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);


    }
  
}
