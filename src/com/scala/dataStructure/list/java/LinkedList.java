package com.scala.dataStructure.list.java;

//<T extends Comparator> <? super Comparator> <?>

public class LinkedList<T> {
    Node<T> head;

    private static class Node<T> {
        T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(T val) {
        if (head == null) {
            head = new Node<>(val);
        } else {
            Node<T> newNode = new Node<>(val);
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(T val) {
        Node<T> start = this.head;
        Node<T> newNode = new Node<>(val);
        while (start.next != null) {
            start = start.next;
        }
        start.next = newNode;
    }

    public void insertAtEndUsingGet(T val) {
        Node<T> newNode = new Node<>(val);
        Node<T> lastNode = getNode(size() - 1);
        lastNode.next = newNode;
    }

    public void deleteGivenIndexNode(int index){
        Node<T> nodeToDelete = getNode(index);

    }

    public void deleteElement(T elm){

    }

    public void deleteLast(){
        Node<T> temp = this.head;
        if (temp == null)
            return;

        Node<T> lastNodePrev = getNode(size()-2);
        lastNodePrev.next = null;
    }

    public void deleteFirst() {
        Node<T> temp = this.head;
        this.head = temp.next;
        System.out.println("temp : "+ temp.data);
        temp.data = null;
    }

    public T get(int index){
       return getNode(index).data;
    }

    private Node<T> getNode(int index){
        Node<T> start = this.head;
        int i = 0;
        while(i != index){
            start = start.next;
            i++;
        }
        return start;
    }

    public int size() {
        int size = 0;
        Node<T> start = this.head;
        while (start != null){
            start = start.next;
            size++;
        }
        return size;
    }
}