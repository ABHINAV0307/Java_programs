package com.abhi.placement_preparation_class;


// Leetcode 168  Excel question
public class leetcode {
    public static void main(String[] args) {
        String s="ZY";
int l=s.length()-1;
        int c;
        int value=0;
        int base=1;
        while(l>=0){
            c=  ((s.charAt(l))-64);
            value+=(base*c);
            base*=26;
            l--;
        }
        System.out.println(value);
    }
}
