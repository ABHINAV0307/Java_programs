package com.abhi.Array;

import java.util.Arrays;

import static com.abhi.Array.Swaparr.swap;
//FACING SOME ERROR CORRECT THIS IN FUTURE
public class insertion {
    public static void main(String[] args) {
        int []arr={2,3,14,23,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int []arr){
     for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j>0;j--){
             if(arr[j]<arr[j-1]){
                 swap(arr,j,j-1);
             }
             else {
                 break;
             }
         }
     }
    }
}
