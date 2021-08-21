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
            tail=newNode;
        }
    }
    public void insertInMiddle(MyNode myNode, MyNode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void popFirstNode() {
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            head = head.getNext();
    }
    public void popLastNode() {
        INode tempNode = head;
        while (tempNode.getNext() != tail) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
        tail = tempNode;
    }

    public void searchElement() {
        if (head == null)
            System.out.println("Linked List is empty");
        else {
            INode tempNode = head;
            int position = 0;
            while (tempNode != null) {
                position++;
                if (tempNode.getKey().equals(30)) {
                    System.out.println("Key value 30 is present at position " + position + " in list");
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    public void insertAtPosition(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtPreviousIndex = (MyNode) head;
        for (int i = 0; i < position - 1; i++) {
            nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
        }
        newNode.next = nodeAtPreviousIndex.next;
        nodeAtPreviousIndex.next = newNode;

    }
    public void deleteAtPosition(int position) {
        MyNode previousNode = (MyNode) head;
        MyNode currentNode = (MyNode) head;
        for (int i = 0; i < position; i++) {
            previousNode = currentNode;
            currentNode = (MyNode) currentNode.next;
        }
        previousNode.next = currentNode.next;
    }
    public void displayNode () {
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