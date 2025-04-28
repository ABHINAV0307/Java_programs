package com.abhi.Resursion;

public class bin_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println( search(arr, 3, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, mid + 1, e);
        }
        else {
            return search(arr, target, s, mid - 1);
        }
    }
}
