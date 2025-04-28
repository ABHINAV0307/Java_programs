package com.abhi.placement_preparation_class;

public class sms {
    String name;
    int marks;
    static int rollno=2;

    public static void main(String[] args) {
        sms ob1=new sms();
        sms ob2=new sms();
ob1.rollno=sms.rollno;
    System.out.println(ob1.rollno);
ob2.rollno=sms.rollno+1;
      //  System.out.println(ob1.rollno);

        System.out.println(ob2.rollno);
       // System.out.println(rollno);
    }
}
