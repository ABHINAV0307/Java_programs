package com.abhi.funtion;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        cal(a);
    }

    static void cal(int num){
        int rem=0,sum=0;
        rem=num%10;
        sum+=rem*rem*rem;
    num=num/10;
    }
}