package com.learnjava;

import java.util.Arrays;
import java.util.Comparator;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 5;
        convertToWave(arr,n);
        // n: size of the array
        //Function to sort the array into a wave-like array.
        for(int i :arr){
          System.out.println(i);
        }
        Arrays.stream(arr).parallel().sorted();

    }

    private static void convertToWave(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 == 0) {
                swap(i, i - 1, arr);
            }
        }
    }

    private static void swap(int first , int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
