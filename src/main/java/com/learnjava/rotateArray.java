package com.learnjava;

public class rotateArray {

    public static void main (String[] args) {
        int size = 0;
        int n = 0;
        int loop[][] ={ {2},
                {5, 2},
                {1, 2, 3, 4, 5} ,
                {10, 3},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};
        for(int k=0;k< loop.length; k++){
            if((k%2)==0 && k!=0){
                int arr[] = new int[loop[k].length];
                int arr1[] = new int[loop[k].length];
               for(int l=0;l< loop[k].length;l++){
                   arr[l]=loop[k][l];
                   arr1[l]=loop[k][l];
                }
                rotateArrays(arr,n,arr1);
                for(int i :arr){
                    System.out.println(i);
                }
            }else if(k%2 !=0){
                for(int l=0;l< loop[k].length;l++){
                   size = loop[k][0];
                   n = loop[k][1];
                }
            }
        }
          }

    private static void rotateArrays(int[] arr, int n,int[] arr1) {
        for(int i=0;i<n;i++){
            int val= arr1[i];
            for(int j=0;j<arr.length && j+1 < arr.length;j++){
                arr[j] =arr[j+1];
            }
            arr[arr.length-1] = val;
        }
    }
}
