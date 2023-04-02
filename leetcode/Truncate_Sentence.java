package com.abhi.leetcode;

import java.util.Arrays;

import static java.lang.System.*;

public class Truncate_Sentence {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        String[] str=s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <4; i++) {
            sb.append(str[i]+" ");
        }
