package com.abhi.placement_preparation_class;

public class newtest {
    public static void main(String[] args) {
        int [] nums = new int []{1,7,3,6,5,6};
        int [] n = new int [nums.length];
        n[0]=nums[0];
        int max=0;
        for(int i=0;i<nums.length;i++){
           max+=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            n[i]=nums[i]+n[i-1];
        }
        }
        }

    }

