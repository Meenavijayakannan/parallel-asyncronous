package com.learnjava;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args){
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int num[] = new int[arr.length];
        int p=0;
        int n=1;

        Arrays.sort(arr);
        for(int i=1;i< arr.length;i=i+2){
            if(arr[i] < 0){
                for(int j=i+1;j<arr.length;j++){
                    int temp=0,flag=0;
                    if(arr[j] > 0) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        flag=1;
                    }
                    if(flag == 1){
                        break;
                    }
                }
            }
        }
        for(int i :arr){
            System.out.println(i);
        }

    }
}
