package com.abhi.Resursion;

public class ONE_2_N {
    public static void main(String[] args) {
        print(4);
    }
    static void print(int n){
        if(n==0){   //base condition
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
