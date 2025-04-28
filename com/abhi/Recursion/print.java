package com.abhi.Resursion;

public class print {
    public static void main(String[] args) {
        print(1);
        //funtion to print first 5 number
    }
    static void print(int n){
        while(n==6){
           return;
        }
        System.out.println(n);
        print(n+1);
    }
}
