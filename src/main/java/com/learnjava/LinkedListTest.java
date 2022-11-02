package com.learnjava;

import java.util.LinkedList;

public class LinkedListTest {


    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
        LinkedLists linkedList = new LinkedLists();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        LinkedLists.Node head = linkedList.head();

        //finding middle element of LinkedList in single pass
        LinkedLists.Node current = head;
        int length = 0;
        LinkedLists.Node middle = head;

        while (current.next != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next;
        }

        if (length % 2 == 1) {
            middle = middle.next;
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);

    }
}