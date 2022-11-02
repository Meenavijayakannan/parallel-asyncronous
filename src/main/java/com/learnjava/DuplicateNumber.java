package com.learnjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateNumber {
    static int[][] arr = {{1,2,3,2,4,2,5,3,7},
            {1,5,3,4,3,8,7,5}};
    public static  void main(String args[]){
        List<Integer> dupList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for(int j=0;j< arr.length;j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (!list.contains(arr[j][i])) {
                    list.add(arr[j][i]);
                } else if(!dupList.contains(arr[j][i])) {
                    dupList.add(arr[j][i]);
                    //System.out.println(arr[j][i]);
                }
            }
            System.out.println("List");
            for(Object obj : list){
                System.out.println(obj);
            }
            System.out.println("dupList");
            for(Object obj : dupList){
                System.out.println(obj);
            }
            list = new ArrayList<>();
            dupList = new ArrayList<>();
        }

    }
}
