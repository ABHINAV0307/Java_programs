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
        if (index == 0) {
            addfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }


    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
         return node;
    }



    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }



//    public void insert(int val,int index){
//        if(index==0){
//            addfirst(val);
//            return;
//        }
//        if(index==size){
//            insertlast(val);
//            return;
//        }
//        Node temp = head;
//        for(int i=1;i<index;i++){
//            temp=temp.next;
//        }
//        Node node=new Node(val,temp.next);
//        temp.next=node;
//        size++;
//    }

    public int delfirst() {
        int val=head.value;
        if (head != null) {
            head = head.next;
        } else
            tail = null;
        size--;
        return val;
    }
    public int deletelast(){
        if(size <=1){
            return delfirst();
        }
}
