package com.abhi.leetcode;

public class main {
    public static void main(String[] args) {
        String a="ab";
        String b="cd";
        String c="acbd";

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        char[] ch3 = c.toCharArray();
        int count =0;
        int i,j,k;
        for(i=0;i<a.length();i++){
            count+=(int)ch1[i];
        }
        System.out.println(count);
        for(j=0;j<b.length();j++){
            count+=(int)ch2[j];
        }
        System.out.println(count);

        for(k=0;k<c.length();k++){
            count-=(int)ch3[k];
        }
        System.out.println(count);
        if(count==0)
            System.out.println("TRue");
        else
            System.out.println("FAlse");
    }

        }

//        System.out.println(count);


