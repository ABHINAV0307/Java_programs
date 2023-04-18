package com.abhi.placement_preparation_class;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int flag=0;
        String[] substr = str.split(",");
        int n=substr.length;
        int [] arr = new int [substr.length];
