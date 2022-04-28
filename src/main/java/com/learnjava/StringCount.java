package com.learnjava;

import java.util.*;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int N=63;
        int result = 2^4;
        for(int i=0;i<N/4;i++){
            if((2^0) == 16){
                System.out.println("reult" +1);
            }
        }
int value=0;

        for(int i=0;i<=N/4;i++){
            if(i==0){
                value=1;
            }else{
                value=1;
                for(int j=1;j<=i;j++){
                    value=value*2;
                }
            }
            /*if(val == N){
                result = 1;
                return result;
            }*/
        }

        for(int i=1;i<(N+1)/4;i++){
            int values=1;
            for(int j=1;j<=i;j++){
                values= values*2;
                if(values<N){
                    value=values;
                }
            }
        }

        System.out.println(result);
       /* String s1 = "a1b2c3d4";
        StringBuilder s2 = new StringBuilder();
        char[] c = s1.toCharArray();
        for(int i=0; i<s1.length();i=i+2){
            int j = i+1;
            Integer l= Integer.valueOf(s1.substring(j,j+1));
            for (int k=0; k<l;k++){
                s2.append(c[i]);
            }
        }
        System.out.println("the values of "+ s2);*/
        //Print the given character with count a1b2c3..

        String s1="aaabbcccccdddd";
        char[] c = s1.toCharArray();

        HashMap<Character,Integer> list = new HashMap<>();
        int count =0;
        for(int i=0;i<s1.length();i++){
           if(list.containsKey(c[i])){
               count=list.get(c[i]);
               list.put(c[i],count+1);
            }else{
               count =0;
               list.put(c[i],count+1);
           }
        }
        StringBuilder sb = new StringBuilder();
        for(Character val:list.keySet()){
            sb.append(val);
            sb.append(list.get(val));
        }
        System.out.println("Appended Value  "+sb);
        StringBuilder sb1 = new StringBuilder();
        list.keySet().stream().map(val->{
            sb1.append(val);
            sb1.append(list.get(val));
            return sb1;
        }).collect(Collectors.joining(""));

        System.out.println("Appended values "+sb1);
        System.out.println(sb1.reverse().toString());

        String string = "value   is  not sufficient";

       //Converting first letter of word  should be captalized
       String newString = Arrays.stream(string.split("\\s+"))
                .map(val-> val.substring(0,1).toUpperCase()+val.substring(1))
                .collect(Collectors.joining(" "));

       System.out.println(newString);

       //Preserving space by reversing word in a sentence
       String s3= Arrays.stream(string.split("\\s+")).map(val-> {
           StringBuilder st = new StringBuilder(val);
           st.reverse();
           return st;
       }).collect(Collectors.joining(""));
       StringBuilder stringBuilder = new StringBuilder(s3);

       for (int i=0;i<string.length();i++){
           if(string.charAt(i) == ' '){
               stringBuilder.insert(i,' ');
           }
       }
       System.out.println(stringBuilder);

       //Find first Non repeated character
        String java="java";
        Map<Character,Integer> hashMap = new LinkedHashMap<>();
        for(char chars : java.toCharArray()){
            hashMap.put(chars ,hashMap.containsKey(chars)?hashMap.get(chars)+1:1);
        }

        for(Map.Entry<Character, Integer> set: hashMap.entrySet()){
            if(set.getValue() == 1){
                System.out.println(set.getKey());
                break;
            }
        }


        //Permutations of string
        
        String s="123";
        printPermutation(s,"");
//reverse
        String rev="reverse";
        String revert =reverse(rev);
        System.out.println(revert);

        //How to remove characters from the first String which are present in the second String
        String remove = "cat";
        String removable = "computer";
        StringBuilder removeBuilder = new StringBuilder(removable);

        for(int i=0;i<removeBuilder.length();i++){
            for(int j=0;j<remove.length();j++){
                if(removeBuilder.charAt(i) == remove.charAt(j)){
                    removeBuilder.deleteCharAt(i);
                }
            }
        }
        System.out.println(removeBuilder);
    }



    private static void printPermutation(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans+ " ");
            return;
        }
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            String res = str.substring(0,i)+str.substring(i+1);

            printPermutation(res,ans+ch);
        }

    }
    //reverse a string


    private static String reverse(String s1) {
        if(s1.isEmpty()){
            System.out.println("Empty");
            return s1;
        }
        else{
            return reverse(s1.substring(1)) + s1.charAt(0);
        }
    }

}
