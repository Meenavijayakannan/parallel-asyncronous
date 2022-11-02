package com.learnjava;

public class CommonElementInThreeSorted {
    public static void main(String[] args){
        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
        for(int i=0;i<input2.length;i++){
            for(int j=0;j<input1.length;j++){
                for(int k=0;k<input3.length;k++){
                    if((input2[i]==input1[j])&& (input1[j] == input3[k])){
                        System.out.println(input2[i]);
                    }
                }
            }
        }
    }
}
