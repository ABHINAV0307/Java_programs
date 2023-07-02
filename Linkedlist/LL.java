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
        size+=1;
    }

    public void insertlast(int val){
        if(tail==null){
            addfirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index) {
            return;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void addlast(){

    }
}
