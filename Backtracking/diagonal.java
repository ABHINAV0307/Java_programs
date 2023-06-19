package com.abhi.Backtracking;

import java.util.ArrayList;

public class diagonal {
    public static void main(String[] args) {
        System.out.println(pathlist("",3,3));

    }
    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathlist(p+"d",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathlist(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathlist(p+"L",r,c-1));
        }
        return list;
    }
}
