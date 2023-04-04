package com.abhi.leetcode;

public class unique {
    public static void main(String[] args) {
        int []arr=new int [26];
        String s="aabb";
        char[]ch=s.toCharArray();
        //System.out.println(ch[0]-'a');
        int val=0;
        for(int i=0;i<s.length();i++){
val=(int)ch[i]-'a';
            arr[val]+=1;
