package com.abhi.Bit_Manipulation;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==1){
            System.out.println("odd");
        }
        else
            System.out.println("even");
    }
}
