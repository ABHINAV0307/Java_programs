package com.abhi.Linkedlist;

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
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
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
