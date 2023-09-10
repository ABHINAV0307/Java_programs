package com.abhi.Resursion;

public class Reverse {

    static int print(int n) {
    int dig=(int)(Math.log10(n))+1;
    return helper(n,dig);
    }
    private static int helper(int n, int dig) {
        if(n%10==0){
            return n;
        }
        int rem=n%10;
        return rem * (int)Math.pow(10,dig-1)+helper(n/10,dig-1);
    }
    public static void main(String[] args) {
        System.out.println(print(4532));
    }
}

