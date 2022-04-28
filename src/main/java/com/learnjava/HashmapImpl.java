package com.learnjava;

import java.util.*;

public class HashmapImpl  {
    public static void main(String[] args){
        /*HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"name");
        hashMap.put(2,"name1");

        hashMap.entrySet().stream()
                .filter(val -> val.getValue().equals("name1"))
                .forEach(s->System.out.println(s.getKey()));*/

        int array[] = {2,5,7,1,3};




        for(int i=0; i<array.length;i++){
            for(int j=i+1 ;j<array.length;j++) {
                int temp =0;
                if (array[i] < array[j]) {
                    System.out.println("Correct order");
                } else {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int val:array) {
            System.out.println(val);
        }

    }


}
