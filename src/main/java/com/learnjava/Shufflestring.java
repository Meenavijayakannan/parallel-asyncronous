package com.learnjava;

public class Shufflestring {
    public static void main(String args[]){
        String first= "abc";
        String second = "def";
        String third = "dabecf";
        Boolean val=checkShuffle(first,second,third);
        if(val == true){
            System.out.println("It is a valid Shuffle");
        }else{
            System.out.println("It is not a valid Shuffle");
        }
    }

    private static boolean checkShuffle(String first, String second, String third) {
        if((first.length()+second.length()) != third.length()){
            return false;
        }
        int i=0,j=0,k=0;
        while(k!=third.length()) {
            if (i < first.length() && first.charAt(i) == third.charAt(k)) {
                i++;
            } else if (j < second.length() && second.charAt(j) == third.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if(i<first.length() || j<second.length()){
            return  false;
        }
        return true;
    }
}
