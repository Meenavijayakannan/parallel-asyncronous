package com.learnjava;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, 67, 44, 34, 89};
        for(int i=1;i<array.length;i++){
            int newElement = array[i];
            int j;
            for(j=i-1;j>=0 && array[j]>=newElement;j--){
                array[j+1]=array[j];
            }
            array[j+1]=newElement;
        }
        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
