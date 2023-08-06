package com.abhi.placement_preparation_class;

import java.util.Scanner;

public class student {
long mark;
String name,address,branch;
//code
    public static void main(String[] args) {
    student st1=new student();
        student st2=new student();
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("enter first marks ");
        int marks1=sc.nextInt();
        System.out.println("enter second marks ");

        int marks2=sc.nextInt();

        st1.name="ayush";
    st1.mark=marks1;
        st2.name="ayush";
        st2.mark=marks2;
