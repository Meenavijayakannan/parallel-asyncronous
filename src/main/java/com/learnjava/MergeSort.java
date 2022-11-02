package com.learnjava;

public class MergeSort {
    public static void main(String args[]){
        int[] array = {20, 35, 67, 44, 34, 89};
        int beg=0;
        int end= array.length-1;
       int[] arr=mergeSort(array,beg,end);
       for(int a:arr){
           System.out.println(a);

       }

    }

    private static int[] mergeSort(int[] array, int beg, int end) {
        if(beg<end){
            int mid=(beg+end)/2;
            mergeSort(array,beg,mid);
            mergeSort(array,mid+1,end);
            merge(array,beg,end,mid);
        }
        return array;
    }

    private static void merge(int[] array, int beg, int end, int mid) {
    int i,j,k;
    int n1=mid-beg+1;
    int n2=end-mid;
    int LeftArray[] = new int[n1];
    int RightArray[] = new int[n2];
    for(i=0;i<n1;i++){
        LeftArray[i]=array[beg+i];
    }
    for(j=0;j<n2;j++){
        RightArray[j]=array[mid+1+j];
    }
    i=0;
    j=0;
    k=beg;
    while(i<n1&&j<n2){
        if(LeftArray[i]<=RightArray[j]){
            array[k]=LeftArray[i];
            k++;
            i++;
        }else{
            array[k]=RightArray[j];
            k++;
            j++;
        }
    }
    while(i<n1){
        array[k]=LeftArray[i];
        k++;
        i++;
    }
    while(j<n2){
            array[k]=RightArray[j];
            k++;
            j++;
    }
    }
}
