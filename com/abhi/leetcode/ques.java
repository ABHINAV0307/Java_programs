package com.abhi.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ques {
    public static void main(String[] args) {
        int [] a={1,2,3,4,12,42};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+ "  ");
        }
        int k=0;
        System.out.println(" ");
        for(int i=0;i<a.length-1;i++) {
            if (a[i] == a[i+1]) {
                System.out.print(a[i]+" *");
                System.out.print(a[i+1]+"# ");
                //System.out.println("Repeat");
            }
        }
    }
}
