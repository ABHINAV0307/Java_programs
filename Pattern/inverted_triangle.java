package com.abhi.Pattern;

public class inverted_triangle {
    public static void main(String[] args) {
pattern(4);
    }
    static void pattern(int n){
        for (int i=0;i<n;i++){
        for(int j=4;j>i;j--){
            System.out.print("*");
        }
            System.out.println("");
        }
    }
}
