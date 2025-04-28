package com.abhi.leetcode;

public class SetMatrixZero {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String s = str.toUpperCase();
        char[] ch = s.toCharArray();
        int a = 0;
        int k = 0;
        int b = str.length() - 1;

        while (a < b) {
            if ((ch[a] < 'A' || ch[a] > 'Z')) {
                a++;
            } else if ((ch[b] < 'A' || ch[b] > 'Z')) {
                b--;
            } else if (ch[a] != ch[b]) {
                k++;
            }
            a++;
            b--;
        }
        for (int i = 0; i < str.length(); i++) {
            if((ch[a] <'A' || ch[a] > 'Z'))
            System.out.print(ch[i]);
        }
    }
}

