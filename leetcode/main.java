package com.abhi.leetcode;

public class main {
    public static void main(String[] args) {
        String a="ab";
        String b="cd";
        String c="acbd";

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        char[] ch3 = c.toCharArray();
        int count =0;
        int i,j,k;
        for(i=0;i<a.length();i++){
            count+=(int)ch1[i];
        }
