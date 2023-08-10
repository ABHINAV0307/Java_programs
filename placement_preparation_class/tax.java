package com.abhi.placement_preparation_class;

import java.util.Scanner;
//jiske aage parenthesis hota hai voh method hota hai / also called function
public class tax {
    private int sal;
    static int incometax(int sal) {
        if(sal<300000){
        return (int) (sal - (sal * 0.01));
        }
        else if(sal>300000 && sal<500000) {
            //System.out.println("eligible for income tax");
            return (int) (sal - (sal * 0.05));
        }
        else
            return (int) (sal - (sal * 0.1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal;
        tax [] v;
        v=new tax[2];
        for(int i=0;i<2;i++)
        {
            v[i].sal=sc.nextInt();
        }
        for(int i=0;i<2;i++){
            System.out.println( v[i].sal);
        }
    }
}
