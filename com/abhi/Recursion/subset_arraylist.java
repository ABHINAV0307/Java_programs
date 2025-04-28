package com.abhi.Recursion;

import java.util.ArrayList;

public class subset_arraylist {
    public static void main(String[] args) {

    }
    static ArrayList print(String p, String up){
        if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=print(ch+p,up.substring(1));
        ArrayList<String> right=print(p,up.substring(1));
        left.addAll(right);
        return right;
    }
}
