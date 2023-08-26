package com.abhi.Playground;

import java.util.ArrayList;
import java.util.HashSet;

public class nnew {
    public static void main(String[] args) {
        // fibonacci number
//        for(int i=0;i<40;i++)
//        {
//            System.out.print(print(i) +"-->");
//        }
//        System.out.print(print(0));
//        System.out.println();
//        System.out.print(print(1));
//        System.out.println();
//        System.out.print(print(3));
//        System.out.println();


        int []arr=new int []{1,1,2,2,2,3,4,5,5,5};
        ArrayList<Integer> val=new ArrayList<>();
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(1);
        System.out.println(val.get(0));
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
