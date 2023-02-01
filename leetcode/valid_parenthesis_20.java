package com.abhi.leetcode;

public class valid_parenthesis_20 {
    class Solution {
        public boolean isValid(String str) {
            int a=0,b=0,c=0;
            int n=str.length();
            char[] s = str.toCharArray();
            for(int i=0;i<n;i=i++)
            {
