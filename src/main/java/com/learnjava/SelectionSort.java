package com.learnjava;

public class SelectionSort {
    public static void main(String[] args){
        int[] array = {20, 35, 67, 44, 34, 89};
        for(int i=0;i<array.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[smallest]){
                    int temp = array[j];
                    array[j]=array[smallest];
                    array[smallest]=temp;
                }
            }
        }
        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
