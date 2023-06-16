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
