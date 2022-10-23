package com.abhi.Array;

import java.util.Arrays;

import static com.abhi.Array.Swaparr.swap;
public class bubble_sort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr){
    for(int i=0;i<arr.length-2;i++)
        if (arr[i+1]<arr[i]) {
            swap(arr,i, i+1);
        }
    }
}
