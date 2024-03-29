package com.abhi.Backtracking;

public class all_path {
    public static void main(String[] args) {
        boolean [][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        path("",board,0,0);
    }
    static void path(String p ,boolean[][] maze,int r,int c){

        if(r==maze.length-1 && c== maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1 ){
            path(p+"D",maze,r+1,c);
        }
        //note there is r+1 and c+1 as we are moving from 0 to length
        if(c<maze[0].length-1){
            path(p+"R",maze,r,c+1);
        }
        if(r>0){
            path(p+"U",maze,r-1,c);
        }
        if(c>0){
            path(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }
}
