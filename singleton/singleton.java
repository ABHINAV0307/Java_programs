package com.abhi.singleton;

public class singleton {
   private singleton(){

   }
   private static singleton instance;
   public static singleton getInstance(){
      if(instance==null){
         instance=new singleton();
      }
      return instance;
   }
