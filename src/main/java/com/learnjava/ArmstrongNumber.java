package com.learnjava;

public class ArmstrongNumber {
    public static void main(String args[]){
        int number = 153;
        int n=number;
        //int len = (int) (Math.log10(number)+1);
        int len =String.valueOf(number).length();
        System.out.println(len);
        int sum =0;
        while(number>0){
            sum = (int) (sum +Math.pow(number%10,len));
            number = number/10;
        }
        System.out.println(sum);
        if(sum == n){
            System.out.println("It is a armstrong number");
        }
    }
}
