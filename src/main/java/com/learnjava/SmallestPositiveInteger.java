package com.learnjava;

public class SmallestPositiveInteger {
    public static void main(String[] args){
        int arr[] = {1,1,3,4};

        int result =1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>result){
                 System.out.println(result);
            }else{
                result+=arr[i];
            }
        }
        System.out.println(result);
    }
}
