package com.learnjava;

public class Stringval {
    public static void main(String[] args){
        String s1="1000110001";
        String X="000";
        String P="";
        String Y="A";
        //for(int i=0;i<s1.length();i++) {
            //if(s1.substring(i).length() >= X.length()) {
                //if (s1.substring(i,X.length()+1).contains(X)) {
                    P=s1.replaceAll(X,X+Y);
                    //P = s1.substring(0,i)+s1.substring(i, X.length()+1) + Y + s1.substring(i);

                //}

            /*if (s1.substring(i,(X.length()+1)).contains(X)) {
                 P = s1.substring(0, (X.length()+1)) + Y + s1.substring(X.length()+1);

            }*/
            //}
       // }
        System.out.println(P);
    }
}
