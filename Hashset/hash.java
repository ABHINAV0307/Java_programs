package com.abhi.Hashset;

import java.util.HashMap;
import java.util.Map;

//internal implementations
public class hash {
    public static void main(String[] args) {
        int [] arr=new int[]{1,1,2,3,4,5,4,5};

        HashMap<Integer, Integer> map = new HashMap<>();
        {
            for (int i = 0; i < arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else
                    map.put(arr[i],1);
