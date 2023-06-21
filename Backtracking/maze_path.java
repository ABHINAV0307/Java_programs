package com.abhi.Backtracking;

import java.util.ArrayList;

public class maze_path {
    public static void main(String[] args) {
//path("",3,3);
        System.out.println(pathlist("",3,3));

    }
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.print(p+"  ");
            return;
        }
        }
        if(c>1 && r!=1 && c!=1){
            list.addAll(pathlist(p+"L",r,c-1));
        }
        return list;
    }
}
