package com.abhi.leetcode;

public class LastString {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon     ";

        int ans = 0;
        String[] s = str.split(" ");



        for (int i = 0; i < s.length; i++) {
            ans = s[i].length();
            //System.out.print(ans +"  ");
        }
       // System.out.println(ans);



//for(String s :strArray){
//    System.out.println(s);
//}
       // System.out.println(s[s.length() - 1].length());

    }
}
