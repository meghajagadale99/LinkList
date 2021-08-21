package com.bridgelabz;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = head;
            head = newNode;
            head.setNext(tempNode);
        }
    }


    public void append(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;

        if (this.head == null)
            this.head = newNode;

        else {
            tail.setNext(newNode);
            tail = newNode;

        }
    }


    public void displayNode() {
        INode current = head;

        System.out.print("Nodes are: ");
        while (current != null) {
            if (current.getNext() != null) {
                System.out.print(current.getKey() + " - ");
                current = current.getNext();
            } else {
                System.out.println(current.getKey());
                current = current.getNext();
            }
        }

    }
}
