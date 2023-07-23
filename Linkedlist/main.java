package com.abhi.Linkedlist;

public class main {
        public static void main(String[] args) {
            ll list = new ll();
            list.addfirst(3);
            list.addfirst(2);
            list.addfirst(8);
            list.addfirst(17);
            list.delete(1);
            list.insertRec(88, 1);
            list.display();


            // FOR DOUBLY LINKED LIST
//    dll list=new dll();
//    list.insertfirst(3);
//    list.insertfirst(4);
//    list.insertfirst(5);
//    list.insertlast(3);
//    list.display();

//    list.revdisp();
        }
    }

