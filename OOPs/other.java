package com.abhi.OOPs;

public class other {
    public static void main(String[] args) {
        Student abhi=new Student();
    Student random=new Student(abhi);
        System.out.println(random.name);
    }
static class Student {
        int rno;
        String name;
        Student (Student other){
            this.name=other.name;
            this.rno=other.rno;
        }

    public Student() {
             this.rno=10;
            this.name="aBhi";
    }
    //calling one constructor from another

}
}

