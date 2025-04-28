package com.abhi.Playground;

import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        System.out.println(factorial(a));
    }

    public static void print(int n){
        if(n>0) {
            System.out.println("abhi");
            print(n-1);
        }

    }
    public static void print2(int n) {
        if (n > 0) {
            print2(n - 1);
            System.out.println(n);

        }
    }
    public static int sumtilln(int n) {
        if(n==0){
            return 0;
        }
     return n + sumtilln(n-1);
    }

    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        return a * factorial(a-1);
    }
}
