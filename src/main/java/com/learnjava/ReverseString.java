package com.learnjava;

public class ReverseString {
    public static void main(String args[]){
        String val ="Meena";
        StringBuilder builder = new StringBuilder(val);
        builder.reverse();
        System.out.println(builder);

        String string ="Meena";
        String str = reversedString(string);
        System.out.println(str);
        StringBuilder builder1 = new StringBuilder();

        String val1 = "Meena";
        for(int i=val1.length()-1;i>=0;i--){
            builder1.append(val1.charAt(i));
        }
        System.out.println("Builder1"+builder1);
    }

    private static String reversedString(String string) {
        if(string.isEmpty()){
            return string;
        }
        char ch = string.charAt(0);
        return reversedString(string.substring(1))+ch;
    }
}
