package com.abhi.Recursion;

public class skip {
    public static void main(String[] args) {
    stream("","babbaaddad");
        System.out.println(skip("babbaaddad"));
    }
    static void stream(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch == 'a'){
            stream(p,up.substring(1));
        }else{
            stream(p+ch,up.substring(1));

        }
    }
    static String skip(String up){
        if(up.isEmpty()){

            return " ";
        }
        char ch =up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
}

