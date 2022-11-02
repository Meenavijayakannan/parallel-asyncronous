package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RepeatedExceptOne {
    public static void main(String[] args){
        int arr[] =  {1, 1, 2, 2, 3, 4, 4, 5, 5};
        List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List newList = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(newList.contains(list.get(i))){
                newList.remove(list.get(i));
            }else{
                newList.add(list.get(i));
            }
        }
        for(Object a:newList){
            System.out.println(a);
        }
    }
}
