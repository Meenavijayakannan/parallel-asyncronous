package com.learnjava;

public class PrimeNumbers {
    public static void main(String[] args){
        int n=10;
        printPrimeNumbers(10);
        checkNumberPrimeorNot(16);
    }

    private static void checkNumberPrimeorNot(int n) {
        int count = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count<1){
                System.out.println("This is not a prime number"+n);
        }else{
            System.out.println("This is a prime number"+n);
        }
    }

    private static void printPrimeNumbers(int n) {
        for(int i=2;i<20;i++){
            int counter =0;
            for(int num=i;num>=1;num--){
                if(i%num ==0){
                    counter++;
                }
            }
            if(counter<=2){
                System.out.println(i);
            }
        }
    }
}
