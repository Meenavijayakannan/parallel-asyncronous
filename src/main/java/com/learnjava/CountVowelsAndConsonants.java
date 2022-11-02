package com.learnjava;

import java.util.ArrayList;
import java.util.List;

public class CountVowelsAndConsonants {
    public static void main(String[] args){
        String word ="MJava";
        char[] chars = word.toCharArray();
        int vowelCount =0 , conCount=0;
        List<Character> list = List.of('a','e','i','o','u');
        for(char c:chars){
           if(list.contains(c)){
                vowelCount++;
            }else{
                conCount++;
            };
        }
        System.out.printf("%s and %s",vowelCount,conCount);
        System.out.println("");
        String number = "67890";
        int val=Integer.parseInt(number);
        System.out.println(val);
        //Replace space with %20
        String space = "Java  is Great";
        String str=space.replaceAll(" ","%20");
        System.out.println(str);
    }
}
