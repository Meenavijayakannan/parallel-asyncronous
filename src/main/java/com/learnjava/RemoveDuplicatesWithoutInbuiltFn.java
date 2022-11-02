package com.learnjava;

import java.util.Arrays;

public class RemoveDuplicatesWithoutInbuiltFn {
    public static void main(String[] a){
        int arr[] = {1,1,2};
        Arrays.sort(arr);
        int previous = arr[0];
        int result[] = new int[arr.length];
        int k=0;
        result[k] = previous;
        for(int i=1;i<arr.length;i++){
            int val = arr[i];
            if(val!=previous){
                result[++k]=arr[i];
            }
            previous = val;
        }
        for(int i: result){
            System.out.println(i);
        }
    }

}
