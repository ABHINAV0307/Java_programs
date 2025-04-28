package com.abhi.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Linear_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int []arr={1,2,3,4,23,2};
        print(arr,2,0,list);
        System.out.println(list);
    }
    static void print(int [] arr, int target, int index,ArrayList<Integer> list){

        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        print(arr,target,index+1,list);
    }
}
