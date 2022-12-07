package com.abhi.OOPs;

public class This_key {
    public static void main(String[] args) {
        Student abhi=new Student();
        Student tri=new Student(7);
        System.out.println(abhi.rno);
        System.out.println(abhi.name);
        System.out.println(tri.rno);
        System.out.println(tri.name);
    }
    static class Student{
        int rno;
        String name;
        //this is normal constructor
        Student(){
            this.rno=1;
            this.name="Abhinav";
        }
        void greeting(){
            System.out.println();
        }
        //this is taking value also constructo
        Student(int a) {
            this.rno = a;
            //this is replacing it with name of reference variable
            this.name = "Abhinav";
        }
    }
}

