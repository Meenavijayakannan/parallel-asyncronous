package com.learnjava;

import java.util.Arrays;
import java.util.List;

public class VowelsInString {
    public static void main(String args[]){

        String string = "Meena";
        int countofvowels = 0;
        List<Character> list = List.of('a','e','i','o','u');
        for(int i=0;i<string.length();i++){
            char input = string.charAt(i);
            if(list.contains(input)){
                System.out.println(input);
                countofvowels++;
            }
        }
        System.out.println(countofvowels);
    }
}
