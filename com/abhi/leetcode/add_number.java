package com.abhi.leetcode;

public class add_number {
    public static void main(String[] args) {
        int num=38;
        while(num>9){
            int rem=0;
            int sum = 0;
            while(num>0){
                sum=0;
                rem=num%10;
                sum=+rem;
                num=num/10;
            }
            num=sum;
        }
        System.out.println(num);
    }
}
