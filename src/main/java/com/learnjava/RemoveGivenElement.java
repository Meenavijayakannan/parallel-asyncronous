package com.learnjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveGivenElement {
    public static void main(String args[]){
        int[] arr={1,2,3,2,4,2,4,5,6};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> newList = list.stream()
                .filter(val -> val != 2).collect(Collectors.toList());
        list.stream()
                .filter(val -> val != 2).forEach(System.out::println);
        for(Object o : newList){
            System.out.println(o);
        }
        list.removeIf(val-> val==2);
        for(Object o : list){
            System.out.println(o);
        }
        List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i=0;i<arrlist.size();i++){
            if(arrlist.get(i)==2){
                arrlist.remove(i);
            }
        }

        for(Object o : arrlist){
            System.out.println("o "+ o);
        }
        int[] newarr = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2){
                newarr[k++]=arr[i];
            }
        }
        for(int va : newarr){
            System.out.println(va);
        }
    }
}
