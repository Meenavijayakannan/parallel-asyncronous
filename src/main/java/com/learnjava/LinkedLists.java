package com.learnjava;

public class LinkedLists {
    public Node head() {
        return head;
    }

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head =null;
    Node tail=null;
    public void add(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head =newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
}
