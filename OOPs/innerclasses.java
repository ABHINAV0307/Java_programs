package com.abhi.OOPs;

class test{
    static String name;
    public test(String name){
        test.name=name;
    }
}
public class innerclasses {
    public static void main(String[] args) {
        test a=new test("abhi");
        test b=new test("nav");
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
