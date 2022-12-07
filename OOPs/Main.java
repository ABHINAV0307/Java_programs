package com.abhi.OOPs;

public class Main {
    public static void main(String[] args) {
        Student abhi=new Student();
        System.out.println(abhi.name);
        System.out.println(abhi.rno);
    }
    static class Student{
        int rno=1;
        String name="aa";
    }
}


