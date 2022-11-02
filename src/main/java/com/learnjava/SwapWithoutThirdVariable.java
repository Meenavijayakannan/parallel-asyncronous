package com.learnjava;

public class SwapWithoutThirdVariable {
    public static void main(String args[]){
     int a=10;
     int b=15;
     b = (a=b+a)-b;
     a= a-b;
     System.out.println(b+""+a);
    }
}

