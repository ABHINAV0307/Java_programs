package com.abhi.EPAM;

import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;

        int b=sc.nextInt();
        int a=sc.nextInt();
        int val=a*b;
        for(int i=a;i<val;i=i+8){
            if(b%i==0)
                k++;
        }
        System.out.println(k);
    }
}
