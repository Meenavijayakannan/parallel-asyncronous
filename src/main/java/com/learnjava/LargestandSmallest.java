package com.learnjava;

public class LargestandSmallest {
    public static void main(String args[]){
        int[] arr = {2,4,5,1,3,9,6,7};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }else if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

    }
}
