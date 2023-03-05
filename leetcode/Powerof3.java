package com.abhi.leetcode;

import java.util.Scanner;

public class Powerof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double val=  (Math.log(n)/Math.log(3));
        int newval= (int) Math.pow(3,val);
        if(newval==n)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
