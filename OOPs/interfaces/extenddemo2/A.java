package com.abhi.OOPs.interfaces.extenddemo2;

public interface  A {
    //static interface method should always have a body
    //call via the interface name
    static void greeting(){
        System.out.println("Hey I am static");
    }
    default void fun(){
        System.out.println("I m in A");
    }
}
