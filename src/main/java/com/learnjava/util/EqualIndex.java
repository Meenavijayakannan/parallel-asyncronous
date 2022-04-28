package com.learnjava.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualIndex {
    public static void main(String[] args){
        ArrayList<Integer> ans=findResult();
        for(Integer x: ans){
            System.out.println(x + " ");
        }
    }



    public static ArrayList<Integer> findResult(){
        int[] arr = {15, 2, 45, 12, 7};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++) {
            if (arr[i] == i+1) {
                list.add(Integer.valueOf(arr[i]));
            }
        }
        return  list;
    }

}
