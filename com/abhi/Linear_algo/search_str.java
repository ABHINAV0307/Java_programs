package com.abhi.Linear_algo;

import java.util.Scanner;

public class search_str {
    public static void main(String[] args) {
        System.out.println("Enter string");

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char m='a';
        System.out.println(search(s,m));
    }
    static int search(String s, char m ){
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==m)
                return i;
        }
        return -1;
    }
}
