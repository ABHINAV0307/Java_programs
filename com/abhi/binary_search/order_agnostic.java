package com.abhi.binary_search;

import java.util.Scanner;

public class order_agnostic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //    int []arr={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        int target=sc.nextInt();
//        System.out.println(arr[0]);
//        System.out.println(arr[4]);
        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("Array in Decreasing order");
            System.out.println("Location"+bin_d(arr,target));
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("Array in Increasing order");
            System.out.println("Location"+bin_i(arr, target));
        }
    }
    static int bin_d(int []arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                e=mid-1;
            else if (target<arr[mid])
                s=mid+1;
            else
                return mid;
        }
        return -1;
    }
    static int bin_i(int []arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if (target<arr[mid])
                e=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
