package com.abhi.OOPs;

public class final_keyword {
    public static void main(String[] args) {
        final int bonus=10;
        //bonus=11;             -this will give error
        final A abhi = new A("abhinav");
        abhi.name="abhinavt";
    }
    static class A{
        final int num=10;
       String name;
        public A(String name) {
        }
        //finalize-we cant do this manually
        @Override
        protected void finalize() throws Throwable {
            System.out.println("object is destroyed");
        }
    }
}
