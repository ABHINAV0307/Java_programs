package com.abhi.OOPs.interfaces.nested;

public class A {
    //nested interface
    public interface nestedinterface{
        boolean isodd(int num);
    }
}
class B implements A.nestedinterface{

    @Override
    public boolean isodd(int num) {
        return (num & 1)==1;
    }
}