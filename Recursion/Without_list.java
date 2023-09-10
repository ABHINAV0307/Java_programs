package com.abhi.Recursion;

import java.util.ArrayList;

public class Without_list {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 23, 2};

        System.out.println( print(arr, 2, 0));
    }
    static ArrayList<Integer> print(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> below=print(arr,target,index+1);
        list.addAll(below);
        return list;
    }
}
