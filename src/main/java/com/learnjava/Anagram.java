package com.learnjava;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s1="Armyee";
        String s2="Maryev";
        boolean val=isAnagram(s1,s2);
        System.out.println(val);
    }

    private static boolean isAnagram(String word, String anagram) {
        if(word.length() != anagram.length())
            return false;
       /* char[] chars = word.toUpperCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder(anagram.toUpperCase());
        for(char c:chars){
            int index = stringBuilder.indexOf(""+c);
            if(index != -1){
                stringBuilder.deleteCharAt(index);
            }else{
                return false;
            }
        }
       return stringBuilder.length() == 0 ? true:false;*/

        char[] charFromWord = word.toUpperCase().toCharArray();
        char[] charFromAnagram = anagram.toUpperCase().toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);

    }
}
