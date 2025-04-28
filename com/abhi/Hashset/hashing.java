package com.abhi.Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(3);
        set.getClass();
        int arr[]=new int [set.size()];
        set.toArray();

        System.out.println(Arrays.toString(arr));
        //set is unique but need not be in order
//another way of traversal using iterator
        Iterator it= set.iterator();
while(it.hasNext())
    System.out.println(it.next());

        }
    }

