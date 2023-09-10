package com.abhi.Resursion;

public class fib {
    public static void main(String[] args) {
        System.out.println(cal(5 ));
    }
    static int cal(int n){
        if(n<2){
            return n;
        }
        return cal(n-1)+cal(n-2);
        }
    }

