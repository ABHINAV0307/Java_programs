package com.abhi.Hashset;

import java.util.HashMap;
import java.util.Map;

public class basics {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("India",120);
        map.put("China",150);
        map.put("US",30);
        System.out.println(map);
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
        if(map.containsKey("China")){
            System.out.println("China is present");
        }

        map.remove("US");
