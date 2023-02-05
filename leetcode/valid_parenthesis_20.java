package com.abhi.leetcode;

public class valid_parenthesis_20 {
    class Solution {
        public boolean isValid(String str) {
            int a=0,b=0,c=0;
            int n=str.length();
            char[] s = str.toCharArray();
            for(int i=0;i<n;i=i++)
            {
                if(s[i]=='('&& b==0 && c==0 && a>=0 && s[i+1]==')')
                    a++;
                else if(s[i]==')'&& b==0 && c==0 )
                    a--;

                else if(s[i]=='{'&& a==0 && c==0 && b>=0 && s[i+1]=='}')
                    b++;
                else if(s[i]=='}'&& a==0 && c==0)
                    b--;

                else if(s[i]=='['&& a==0 &&b==0 &&c>=0 && s[i+1]==']')
                    c++;
                else if(s[i]==']' && a==0 &&b==0)
                    c--;


                /*
                for(int i=0;i<n;i=i+2)
        {
        if(s[i]=='(' && s[i+1]==')')
