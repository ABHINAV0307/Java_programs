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
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1 ){
            path(p+"D",maze,r+1,c);
        }
        //note there is r+1 and c+1 as we are moving from 0 to length
