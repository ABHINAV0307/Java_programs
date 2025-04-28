package com.abhi.OOPs.interfaces;

public class cdplayer implements media {
    @Override
    public void start() {
        System.out.println("Start music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }
}
