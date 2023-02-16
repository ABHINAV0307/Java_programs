package com.abhi.Linkedlist;

public class LL {
private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
}
