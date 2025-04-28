package com.abhi.Resursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(print(4));
    }
    static int print(int n){
        if(n<=1) {
            return 1;
        }
        return n*print(n-1);
    }
}
