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
