package com.learnjava;

public class BubbleSort {
    public static void main(String args[]) {
        int[] array = {20, 35, 67, 44, 34, 89};
        bubbleSort(array);
        for (int arr : array) {
            System.out.println(arr);
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }
}
