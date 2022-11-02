package com.learnjava;

public class permutation {
    public static void main(String[] args){
        String word="god";
        permu(" ",word);
    }

    private static void permu(String perm, String word) {
        if(word.isEmpty()){
             System.err.println(perm+word);
        }else{
            for(int i=0;i<word.length();i++){
                permu(perm+word.charAt(i),word.substring(0,i)+(word.substring(i+1,word.length())));
            }
        }
    }
}
