package com.learnjava;

public class PalindromeNumbers {
    public static void main(String args[]){
        int k= 141;
        int n=k;
        long r= 0;
        while(n!=0){
            r= r*10+n%10;
            n=n/10;
        }
        System.out.println(r);
        if(k == r){
            System.out.println(k+" is a palindrome numbers");
        }else{
            System.out.println(k+" is not a palindrome numbers");
        }
    }
}
