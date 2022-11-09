package com.learnjava;

public class Combination {
    public static void main(String[] args){
        String s="abc";
        combination("",s);

    }

    private static void combination(String s, String word) {

            System.err.println( s);

          for(int i=0;i<word.length();i++){
                combination(s+word.charAt(i),word.substring(i+1));
          }

    }
}
