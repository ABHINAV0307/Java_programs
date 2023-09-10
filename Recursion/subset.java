package com.abhi.Recursion;

public class subset {
    public static void main(String[] args) {
        print("","abc");
    }
    static void print(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+"  ");
            return;
        }
        char ch=up.charAt(0);
print(ch+p,up.substring(1));
print(p,up.substring(1));
    }
}
