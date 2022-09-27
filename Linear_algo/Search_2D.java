package com.abhi.Linear_algo;

import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int [][] arr={
                {12,4,5},
                {5,7,2},
                {11,65,8,5}
        };
        int target=2;
        int [] ar=find (arr,target);
        System.out.println(Arrays.toString(ar));
        System.out.println(search(arr,target));
         target=15;
        System.out.println(search(arr,target));
    }
    static boolean search(int [][] a,int b){
        for(int i=0;i<3;i++){
            for(int j=0;j<a[i].length;j++){
                if(b==a[i][j])
                    return true;
            }
        }
        return false;
    }
    static int[] find(int [][] a,int b){
        for(int i=0;i<3;i++){
            for(int j=0;j<a[i].length;j++){
                if(b==a[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
