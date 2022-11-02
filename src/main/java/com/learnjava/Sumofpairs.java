package com.learnjava;

public class Sumofpairs {
    public static void main(String args[]){
        int arr[] = {1,2,8,4,5,6,7,3};
        int sum =6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < sum && arr[j] < sum) {
                   if(arr[i]+arr[j]==sum){
                       System.out.println("("+arr[i]+","+arr[j]+")");
                   }
                }
            }
        }
    }
}
