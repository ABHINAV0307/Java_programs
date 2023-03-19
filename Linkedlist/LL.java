package com.abhi.Linkedlist;

//implementation of linked list
class ll{
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //addition of element in list
    public void addfirst(String data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
