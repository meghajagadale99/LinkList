package com.bridgelabz;

public class LinkList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.displayNode();
        myLinkedList.insertAtPosition(40, 2);
        myLinkedList.displayNode();
        myLinkedList.deleteAtPosition(2);
        myLinkedList.displayNode();

    }
}