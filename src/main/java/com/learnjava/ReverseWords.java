package com.learnjava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args){
        String word = "This is a word";
        String newword = Arrays.stream(word.split("\\s+")).map(val -> {
            StringBuilder sb = new StringBuilder(val);
            sb.reverse();
            return sb;
        }).collect(Collectors.joining(" "));
        System.out.println(newword);

        String[] split = word.split(" ");
        StringBuilder sbuilder = new StringBuilder();
        for(int i=(word.split(" ").length);i>0;i--){
            sbuilder.append(split[i-1]+" ");
        }

        System.out.println(sbuilder);
    }
}
