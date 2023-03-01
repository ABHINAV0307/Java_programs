package com.abhi.Bit_Manipulation;

public class flip {
    public int[][] flip(int [][] image) {
        for(int []row:image ){
            for(int i=0;i<(image.length+1)/2;i++){
                int temp=row[i]^1;
