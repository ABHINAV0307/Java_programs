package com.abhi.binary_search;

public class bin_algo {
    public static void main(String[] args) {
int []arr={1,2,3,5,6,7,22,35,90};
        System.out.println(bin(arr,11));
    }
    static int bin(int []arr,int target){
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

