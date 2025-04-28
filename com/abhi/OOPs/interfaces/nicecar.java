package com.abhi.OOPs.interfaces;

public class nicecar {
    private engine engine;
    public nicecar(){
        engine=new powerengine();
    }

    public nicecar(engine engine){
        this.engine= engine;
    }
    public void start(){
        engine.start();
    }
}
