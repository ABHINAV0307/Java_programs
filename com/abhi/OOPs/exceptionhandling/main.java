package com.abhi.OOPs.exceptionhandling;

public class main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
       try {
           divide(a,b);

           String name="Abhinav";
           if(name.equals("Abhinav")){
               throw new myexception("name is abhinav");
           }
       } catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
       catch (Exception e){
           System.out.println("Normal Exception");
       }finally {
           System.out.println("This will be always executed");
       }

    }
    static int divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("Please dont divide by zero");
        }
        return a/b;
    }
}
