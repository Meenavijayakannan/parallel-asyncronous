package com.learnjava;

public class SubArraySumToZero {
    public static void main(String[] args){
        int arr[] = {4, 2, -3, 1, 6};
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j< arr.length;j++){
                sum+=arr[j];
                if(sum ==0){
                    System.out.println(i+","+j);
                    break;
                }
            }
        }
    }
}
