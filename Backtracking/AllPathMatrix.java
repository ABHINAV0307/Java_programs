package com.abhi.Backtracking;

import java.util.Arrays;

public class AllPathMatrix {
    public static void main(String[] args) {
        boolean [][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        int [][] path=new int [board.length][board[0].length];
        pathprint("",board,0,0,path,1);
    }
    static void pathprint(String p ,boolean[][] maze,int r,int c,int [][]path,int step){
        if(r==maze.length-1 && c== maze[0].length - 1){
            path[r][c]=step;
            for(int []arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1 ){
            pathprint(p+"D",maze,r+1,c,path,step+1);
        }
        //note there is r+1 and c+1 as we are moving from 0 to length
        if(c<maze[0].length-1){
            pathprint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            pathprint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            pathprint(p+"L",maze,r,c-1,path,step+1);
