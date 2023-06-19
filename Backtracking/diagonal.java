package com.abhi.Backtracking;

import java.util.ArrayList;

public class diagonal {
    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        if(c>1){
            list.addAll(pathlist(p+"L",r,c-1));
        }
        return list;
    }
}
