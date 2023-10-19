package com.abhi.Playground;

public class sept {
}
class Solution {
    public boolean isMonotonic(int[] nums) {
        int deec=0,inc=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                dec++;
            }
            if(nums[i]<=nums[i+1])
                inc++
        }
        if(inc==nums.length-1 || dec == nums.length-1){
            return true;
        }
