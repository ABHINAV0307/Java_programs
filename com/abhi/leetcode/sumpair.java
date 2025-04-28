package com.abhi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class sumpair {
    public static void main(String[] args) {
        int n=6;
        int k=3;
        int count=0;
        List<Integer> arr = new ArrayList<Integer>(5);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        for(int i = 0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if((arr.get(i)+arr.get(j))%k==0) {
                    System.out.println(arr.get(i)+" "+arr.get(j));
                    count++;
                }
                // break;
            }
        }
        System.out.println(count);
    }

}


