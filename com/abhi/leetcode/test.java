package com.abhi.leetcode;

public class test {
    public static void main(String[] args) {
        int num=38;
        int val=num;
        while(val>9){
num=val;
        int sum = 0;
        int rem = 0;
        while(num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        val=sum;

        }
        System.out.println(val);
    }
}
