package com.abhi.binary_search.bin_interview;

public class leetcode {
    public static void main(String[] args) {
       int [] nums = [5,7,7,8,8,10];
       int target=8;
       bin(nums,target);
    }

    static int bin(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid])
                s = mid + 1;
            else if (target < arr[mid])
                e = mid - 1;
            else {
                return mid;
            }
        }
        return e;
    }
}