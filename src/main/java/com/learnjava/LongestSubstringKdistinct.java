package com.learnjava;

public class LongestSubstringKdistinct {
    public static void main(String[] args){
        String s="ecebab";
        int k=2;
        System.out.println(checkLongestSub(s,k));

    }

    private static int checkLongestSub(String s, int k) {
        int r=0,l=0,max=0,distinct=0;
        int[] map = new int[256];
        if(s==null || s.length() ==0){
            return 0;
        }
        for(;r<s.length();r++){
            if(map[s.charAt(r)]==0){
                distinct++;
            }
            map[s.charAt(r)]++;
            while(distinct>k){
                map[s.charAt(l)]--;
                if(map[s.charAt(l)]==0){
                    distinct--;
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
