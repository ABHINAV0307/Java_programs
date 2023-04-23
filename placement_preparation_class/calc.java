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
        for(int i=0; i<substr.length; i++) {
            arr[i] = Integer.parseInt(substr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]==5){
                flag=1;
            }
            if(arr[i]==8&&flag!=1){
                System.out.println("wrong input");
                break;
            }
        }
        int val=0;
        int f=1;
        for(int i=0;i<n;i++){
            if(arr[i]>4&&arr[i]<9){
                val=(val+arr[i])*flag;
            f*=10;
            }
        }
        System.out.println(val);
