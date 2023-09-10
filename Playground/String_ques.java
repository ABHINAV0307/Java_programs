package com.abhi.Playground;

public class String_ques {
    public static void main(String[] args) {
        String nums = new String("12345");
        String check="inavabh";
        System.out.println(largestOddNumber("52"));
//System.out.println(ques(nums,check));
//        int count=0;
//        for(int i=nums.length()-1;i>=0;i--){
//            if(nums.charAt(i)%2==0){
//                count++;
//            }else break;
//            //System.out.println(nums.charAt(i));
//        }
//        System.out.println(nums.substring(0,nums.length()-count));
//
//        System.out.println(largestOddNumber("35427"));
    }
    public static Boolean ques(String val,String check ){
        String str=val+val;
        int max=0;
        int count=0;
        for(int i=0;i<str.length();i++) {
            if ( count == val.length()) {
                return true;
            }
            if (check.charAt(count) == str.charAt(i)) {
                count = count + 1;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return false;
    }


    public static String largestOddNumber(String nums) {
        int cnt = 0;
        for (int i = nums.length() - 1; i >=0; i--) {
            if (nums.charAt(i) % 2 == 0) {
                cnt++;
            } else
                break;
        }
        if (cnt == nums.length() - 1) {
            return "";
        } else
            return nums.substring(0, nums.length() - 1 - cnt);
    }
}
    //    StringBuilder sb=new StringBuilder();
//    sb




        //        if(str.charAt(6)%2==0) {
//            System.out.println(str.charAt(5));
//        }
////        for(int i=str.length()-1;i>0;i++){
////            if((int) ((str.charAt(i) % 2) == 0) {
////
////            }
////
////        }
//    }
//}

//class Solution {
//    public String largestOddNumber(String nums) {
//        int cnt=0;
//        for(int i=nums.length()-1;i>0;i++){
//            if(nums.charAt(i)%2==0){
//                cnt++;
//            }else
//                break;
//        }
//        if(count==nums.length()-1){
//            return "";
//        }else
//            return new String(nums, 0, nums.length()-1-count);
////    StringBuilder sb=new StringBuilder();
////    sb
//    }
