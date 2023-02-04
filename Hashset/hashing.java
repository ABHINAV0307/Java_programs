package com.abhi.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(5);
        set.add(1);
        System.out.println(set);
        //set is unique but need not be in order
//another way of traversal using iterator
        Iterator it= set.iterator();
while(it.hasNext())
    System.out.println(it.next());

        }
    }

