package com.abhi.Recursion;

public class Skip_if_not_same {
    public static void main(String[] args) {
        System.out.println(skip("abhiaabhinavk"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("abhi") && up.startsWith("abhinav")){
            return skip(up.substring(4));
        }else
            return up.charAt(0)+skip(up.substring(1));
    }
}
