package com.learnjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringList {
    public static void main(String args[]){
        List<String> list  = Arrays.asList("Meena", "Bala", "Vijay", "Sidh");
        //list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Collections.sort(list,Collections.reverseOrder());
        list.stream().forEach(System.out::println);
    }
}
