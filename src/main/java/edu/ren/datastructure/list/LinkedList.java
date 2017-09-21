package edu.ren.datastructure.list;

//<T extends Comparator> <? super Comparator> <?>

public class LinkedList<T> {
    Node<T> head;

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
        if (head == null) {
            head = new Node<>(val);
            return;
        }
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

    protected Node<T> getNode(int index){
        Node<T> start = this.head;
        int i = 0;
        int size=size();
        if(index>=size){
            throw new IllegalArgumentException("index is out of bound");
        }
        while(i != index){
            start = start.next;
            i++;
        }
        return start;
    }

    public T getNthFromLast(int nthIndex){
        Node<T> start = this.head;
        int diff = size() - nthIndex;
        for (int i = 0; i < diff; i++) {
            start = start.next;
        }
        return start.data;
    }

    public T getNthFromLastUsingOneLoop(int nthIndex){
        Node<T> start = this.head;
        Node<T> firstPtr = start, secondPtr = start;
        int pos = 0;
        while(pos < size()){
            if (pos >= nthIndex){
                firstPtr = firstPtr.next;
            }
            secondPtr = secondPtr.next;
            pos++;
        }
        return firstPtr.data;
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