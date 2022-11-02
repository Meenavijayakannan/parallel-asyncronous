package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String args[]){
        int arr[] = {1,2,3,2,4,5,2,6,7,8};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        Object[] a =  list.toArray();
        arr = Arrays.stream(a).mapToInt(an->(int)an).toArray();
        for(int arra:arr){
            System.out.println(arra);
        }

    }
}
