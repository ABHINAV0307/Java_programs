package com.abhi.Bit_Manipulation;

public class Magic_number {
    public static void main(String[] args) {
        int a=6;
        int sum=0;
        int base=5;
        while(a>0){
            int last=a&1;
            a=a>>1;
            sum+=last*base;
            base=base*5;
        }
        System.out.println(sum);
    }
}
