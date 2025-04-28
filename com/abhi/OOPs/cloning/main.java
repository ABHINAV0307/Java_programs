package com.abhi.OOPs.cloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {

        human abhi = new human(12,"abhi");
        human twin;
        twin = (human)abhi.clone();
        System.out.println(twin.age + " "+twin.name );
    }
}
