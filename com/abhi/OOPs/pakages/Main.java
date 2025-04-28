package com.abhi.OOPs.pakages;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        human abhi = new human(22, "abhinav", 1200000, false);
        human rahul = new human(22, "rahul", 120042, true);
        System.out.println(abhi.population); //dont do this its not good practise
        System.out.println(rahul.population);
    }
}
