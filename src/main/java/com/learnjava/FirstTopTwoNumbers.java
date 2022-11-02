package com.learnjava;

import java.util.Arrays;

public class FirstTopTwoNumbers {
    public static void main(String args[]){
        int[] arr ={10,5,4,6,7,5};
        Arrays.stream(arr).boxed().limit(2).forEach(System.out::println);
    }
}
