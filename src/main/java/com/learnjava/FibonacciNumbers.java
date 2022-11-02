package com.learnjava;

public class FibonacciNumbers {
    public static void main(String args[]){
        int i=10;
        System.out.println(fibonacci(i));
        printFibonacci(10);
    }

    private static void printFibonacci(int n) {
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<10;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
