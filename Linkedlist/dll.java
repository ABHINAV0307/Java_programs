package com.abhi.Linkedlist;

public class dll {

    Node head;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");
    }
    public void revdisp(){
        Node node =head;
        Node last=null;
        while(node!=null){
            last=node;
            node=node.next;
        }
        System.out.println("END");

        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }System.out.print("START");
