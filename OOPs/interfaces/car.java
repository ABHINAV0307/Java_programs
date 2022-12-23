package com.abhi.OOPs.interfaces;

public class car implements engine,brake{
    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    public void start() {
        System.out.println("I start like normal car");
    }

    public void stop() {
        System.out.println("I stop like normal car");
}
