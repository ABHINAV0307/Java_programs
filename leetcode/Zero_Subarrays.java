package com.abhi.leetcode;

public class Zero_Subarrays {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 0, 0, 2, 0, 0, 4};
        long ans = 0, no = 0;
        for (int i : nums) {
            if (i != 0) no = 0;
            else ans += ++no;
            System.out.println(ans);
        }
    }
}
