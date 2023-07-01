package com.abhi.Linkedlist;

public class ll {
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
    }
    public void addlast(){

    }
}
