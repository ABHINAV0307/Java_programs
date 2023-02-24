package com.abhi.Array;
import java.util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(10);
        list.add(5);
        list.add(16);
        list.add(21);
        list.add(9);
        list.sort(Comparator.naturalOrder());
        Collections.sort(list);

        System.out.println(list);
        list.set(0,-5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
}
