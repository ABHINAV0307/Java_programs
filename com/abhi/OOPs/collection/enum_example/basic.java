package com.abhi.OOPs.collection.enum_example;

public class basic {
    enum week implements A{
        mon,tues,wed,thur,fri,sat,sun;
        //these are enum constant
        //public ,static and final
        //since its final we can create child enums
        //type of week
week(){
    System.out.println("Constructor for "+ this);
}
        @Override
        public void hello() {
            System.out.println("how are you");
        }
    }

    public static void main(String[] args) {
        week w;
        w=week.mon;
        w.hello();
    }
}
