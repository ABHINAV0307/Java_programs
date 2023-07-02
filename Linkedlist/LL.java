package com.abhi.Linkedlist;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size=0;
    }

    public void addfirst(int val){
        Node newnode= new Node(val);
        newnode.next=head;
        head=newnode;

        if(tail == null){
            tail=head;
        }
        }
    }
    public void addfirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void addlast(){

    }
}
