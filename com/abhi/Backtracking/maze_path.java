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
        if(r>1 ){
            path(p+"D",r-1,c);
        }
        if(c>1 ){
            path(p+"L",r,c-1);
        }
    }
    static ArrayList<String> pathlist(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(r>1 && r!=1 && c!=1){
           list.addAll(pathlist(p+"D",r-1,c));
        }
        if(c>1 && r!=1 && c!=1){
            list.addAll(pathlist(p+"L",r,c-1));
        }
        return list;
    }
}
