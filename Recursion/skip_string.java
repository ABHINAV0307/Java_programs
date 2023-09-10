package com.abhi.Recursion;

public class skip_string {
    public static void main(String[] args) {
        System.out.println(skip("ahbbsabhiddsjjabhi"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("abhi")){
           return skip(up.substring(4));
        }else
            return up.charAt(0)+skip(up.substring(1));
    }
}


