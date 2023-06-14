package com.abhi.Backtracking;

public class obstracle {
    public static void main(String[] args) {
boolean [][] board={
        {true,true,true},
        {true,false,true},
        {true,true,true}
};
    path("",board,0,0);
    }
    static void path(String p ,boolean[][] maze,int r,int c){
