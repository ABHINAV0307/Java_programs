package com.abhi.EPAM;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k;
        int b = sc.nextInt();
        int c = sc.nextInt();
        int val = a - b;
        if(b>=a&&c>a){
            System.out.println("IMPOSSIBLE");
        }
        c=c-a;
        k=c/val;


        System.out.println(k+1);
    }
}
