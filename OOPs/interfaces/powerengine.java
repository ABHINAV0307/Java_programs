package com.abhi.OOPs.interfaces;

public class powerengine implements engine{


    @Override
    public void start() {
        System.out.println("Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Engine accelerate");

    }
}
