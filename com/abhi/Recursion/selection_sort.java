package com.abhi.Recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int []arr={2,1,4,25};
        print(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void print(int []arr,int r,int c,int max) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if(arr[c] > arr[max]){
                print(arr,r,c+1,c);
            } else {
                print(arr, r, c + 1, max);
            }
            } else {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            print(arr,r-1,0,0);
        }

        }
}
