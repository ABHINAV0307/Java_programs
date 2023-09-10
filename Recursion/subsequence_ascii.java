package com.abhi.Recursion;

public class subsequence_ascii {
    public static void main(String[] args) {
        print("","abc");
    }



    static void print(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+"  ");
            return;
        }
        char ch=up.charAt(0);
        print(ch+p,up.substring(1));
        print(p,up.substring(1));
        print(p+(ch+0),up.substring(1));
    }
}
