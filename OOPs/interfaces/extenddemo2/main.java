package com.abhi.OOPs.interfaces.extenddemo2;

public class main implements A,B{

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        main obj=new main();
        A.greeting();
    }

    @Override
    public void fun() {
        A.super.fun();
    }
}
