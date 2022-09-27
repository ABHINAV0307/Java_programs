package com.abhi.Linear_algo;

import java.util.Scanner;

public class min_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        System.out.print("Enter element of Array    ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Smallest Element    ");
        System.out.println(small(a));
    }
    static int small(int []arr){
        int l=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<l){
                int temp=arr[i];
                arr[i]=l;
                l=temp;
            }
        }
        return l;
    }
}
