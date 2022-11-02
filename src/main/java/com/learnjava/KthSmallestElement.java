package com.learnjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class KthSmallestElement {
    public static void main(String args[]){
        int k=3;
        int arr[] = {2,5,1,3,9,6,7};
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        int arr1[] = {2,5,1,3,9,6,7};
        for(int i=0;i<arr1.length;i++){
            int temp =0;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    temp= arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=temp;
                }
            }
        }
        for(int a:arr1){
            System.out.println(a);
        }
        int[] a ={1,7,2,4,3,9};
        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //Arrays.sort(a, Collections.reverseOrder());
    }
}
