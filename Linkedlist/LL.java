package com.abhi.Linkedlist;

public class ll {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
            currnode=currnode.next;
        }
    }

    public static void main(String[] args) {
        ll list=new ll();
        list.addlast("I");
        list.addlast("am");
        list.addlast("abhi");
        list.printlist();
        //System.out.println(list);
    }
}
