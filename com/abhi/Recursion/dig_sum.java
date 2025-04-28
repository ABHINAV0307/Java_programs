package com.abhi.Resursion;

public class dig_sum {
    public static void main(String[] args) {
        System.out.println(print(12234));
    }
    static int print(int n){
        if(n<=0){
            return 0;
        }
        return n%10+print(n/10);
    }
}
