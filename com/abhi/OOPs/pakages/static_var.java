package com.abhi.OOPs.pakages;

public class static_var {
    public static void main(String[] args) {

    }
    static void fun(){
 static_var obj=new static_var();
 obj.greeting();
 //you cant access non static stuff without referencing their instances in
 //a static context
    }
    void greeting(){
        fun();
    }
}
