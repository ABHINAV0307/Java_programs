package com.abhi.binary_search.bin_interview;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6,7};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(bin(arr,target));
    }
    static int bin(int []arr,int target){
        int s=0;
        int e=arr.length-1;

        while (s<=e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid])
                s = mid + 1;
            else if (target < arr[mid])
                e = mid - 1;
            else {
               return mid;
            }
        }
        return s;
    }
}
