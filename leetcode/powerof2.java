package com.abhi.leetcode;

public class powerof2 {
    public static void main(String[] args) {
        int val = 65498;
        //[1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
        int sum = 0;
        int base = 1;
        while (val > 0) {
            if ((val%10) == 1)
                sum += base * (val % 10);
            base *= 2;
            val = val/10;
        }
        System.out.println(sum);

    }
}
