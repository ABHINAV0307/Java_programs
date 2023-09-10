package com.abhi.Playground;

import java.util.Scanner;

public class ST_LAB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int flag=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c) {
            System.out.println("Equilateral Triangle");
            flag=1;
        }else if (a==b || a==c || b==c){
            System.out.println("Isosceles Triangle");
        flag=2;
        }

    }
}
