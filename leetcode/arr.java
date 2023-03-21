package com.abhi.leetcode;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int []arr=new int[]{1,0,0,0,1};
                Arrays.sort(arr);
                for(int i=0;i<arr.length-1;i++){
                    if((arr[i]+1)!=(arr[i+1])){
                        System.out.println(arr[i]+1);
                    }
        }
    }
}
