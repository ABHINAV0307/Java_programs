package com.abhi.Pattern;
import java.lang.Math;
public class pattern {
    public static void main(String[] args) {
        patt(4);
    }
    public static void patt(int n){
    for(int row=0;row<2*n;row++){
    int nocol=row>n ?2*n-row : row;

    int space=(n-nocol);
    for(int i=0;i<space;i++){
        System.out.print(" ");
    }

    for(int col=0;col<nocol;col++){
        System.out.print("* ");
    }
    System.out.println();
}
    }
}
