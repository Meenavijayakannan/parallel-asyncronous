package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionArrays {
    public static void main(String args[]){
        int arr[] ={21,45,34,65,74,68};
        int arr1[] ={43,21,56,34,32};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr1.length;j++){
                if(arr[i] == arr1[j]){
                    list.add(arr[i]);
                }
            }
        }
        Object[] ar=list.toArray();
        int[] news = Arrays.stream(ar).mapToInt(val -> (int) val).toArray();
        for(Object a : ar){
            System.out.println(a);
        }
        List newList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        newList.removeAll(list);
        for(Object a:newList){
            System.out.println(a);
        }
    }
}
