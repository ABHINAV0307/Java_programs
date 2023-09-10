package com.abhi.Recursion;

public class linear {
    public static void main(String[] args) {
        int []arr={1,2,4,5,3};
        System.out.println(search(arr,0,3));
    }
    static boolean search(int []arr,int index,int target){
        if(index > arr.length-1){
            return false;
        }
        return arr[index]==target || search(arr,index+1,target);
    }
}
