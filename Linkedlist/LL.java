package com.abhi.Linkedlist;

//implementation of linked list
class ll{
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

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
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
