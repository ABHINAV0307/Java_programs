package com.abhi.OOPs.pakages;

public class human {
   int age;
   String name;
   int salary;
   Boolean married;
   static long population;
   public human(int age , String name ,int salary,Boolean married){
       this.age=age;
       this.name=name;
       this.salary=salary;
       this.married=married;
        human.population+=1;
        //to access static variable you need to use class name
   }
}

