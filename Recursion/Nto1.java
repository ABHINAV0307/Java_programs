package com.abhi.Resursion;

public class Nto1 {
    public static void main(String[] args) {
       // System.out.println(print);
    print(5);
    }
    static void print(int n){
        if(n==0){   //base condition
           return;
        }
        System.out.println(n);
        print(n-1);
    }
}
