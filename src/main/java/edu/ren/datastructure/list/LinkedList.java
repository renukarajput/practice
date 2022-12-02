package edu.ren.datastructure.list;

//<T extends Comparator> <? super Comparator> <?>

import java.util.StringJoiner;

public class LinkedList<T> {

    Node<T> head;

    public LinkedList() {
    }

    public LinkedList(Node<T> head) {
        this.head = head;
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

    public void insertAtIndex(int index, T val) {
        if (index == 0) {
            Node<T> oldHead = getNode(0);
            Node<T> newHead = new Node<>(val);
            newHead.next = oldHead;
            head = newHead;
            return;
        }
        Node<T> prevNode = getNode(index - 1);
        Node<T> nextNode = getNode(index);
        Node<T> newNode = new Node<>(val);
        prevNode.next = newNode;
        newNode.next = nextNode;

    }

    public void insertAtEnd(Node<T> node) {
        getNode(size() - 1).next = node;
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

    public void insertInSortedList(T val) {
        Node<T> curr = this.head;
        Node<T> nodeToInsert = new Node<>(val);

        if (curr == null) {
            head = new Node<>(val);
            return;
        }
        while (curr.next != null && (((Comparable) curr.data).compareTo(nodeToInsert.data) < 0)) {
            curr = curr.next;
            break;
        }
        nodeToInsert.next = curr.next;
        curr.next = nodeToInsert;
    }


    public Node<T> deleteElementAtIndex(int index) {
        Node<T> prevNode = getNode(index - 1);
        Node<T> node = prevNode.next;
        Node<T> nexNode = node.next;
        prevNode.next = nexNode;
        return node;
    }

    public void deleteGivenNode(T val) {
        Node<T> curr = this.head;
        Node<T> prev = null, next;
        while (curr != null && curr.data != val) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            next = curr.next;
            prev.next = next;
            curr.data = null;
        }
    }

    public void deleteLast() {
        Node<T> temp = this.head;
        if (temp == null)
            return;

        Node<T> lastNodePrev = getNode(size() - 2);
        lastNodePrev.next = null;
    }

    public void deleteFirst() {
        Node<T> temp = this.head;
        this.head = temp.next;
        System.out.println("temp : " + temp.data);
        temp.data = null;
    }

    public T get(int index) {
        return getNode(index).data;
    }

    public Node<T> getNode(int index) {
        Node<T> start = this.head;
        int i = 0;
        int size = size();
        if (index >= size) {
            throw new IllegalArgumentException("index is out of bound");
        }
        while (i != index) {
            start = start.next;
            i++;
        }
        return start;
    }

    public T getNthFromLast(int nthIndex) {
        Node<T> start = this.head;
        int diff = size() - nthIndex;
        for (int i = 0; i < diff; i++) {
            start = start.next;
        }
        return start.data;
    }
// 1-> [2,4]    4-> 6    2-> 5
    //1-> 5  2->7   4->10   6->1  5->3
   // f(4)  f(1)
    public T getNthFromLastUsingOneLoop(int nthIndex) {
        Node<T> start = this.head;
        Node<T> firstPtr = start, secondPtr = start;
        int pos = 0;
        while (pos < size()) {
            if (pos >= nthIndex) {
                firstPtr = firstPtr.next;
            }
            secondPtr = secondPtr.next;
            pos++;
        }
        return firstPtr.data;
    }

    public T nthFromLast(int nthIndex) {
        Node<T> start = this.head;
        Node<T> slow = start, fast = start;
        int count = 0;

        while (fast != null) {
            if (count < nthIndex) {
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
            count++;
        }

// below loop is more optimized than above

       /* while (fast != null) {
            if (count >= nthIndex) {
                slow = slow.next;
            }
            fast = fast.next;

            count++;
        }*/
        return slow.data;
    }

    public void reverseList(Node<T> node) {
        Node<T> curr = node;
        Node<T> prev = null;
        Node<T> next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
//        node = prev;
        this.head = prev;
//       return new LinkedList<>(prev);   //in this case make function type LinkedList<>()
    }


    public void recursiveReverse(Node<T> node) {
        reverse(null, node, null);
    }

    private void reverse(Node<T> prevNode, Node<T> node, Node<T> nextNode) {
        Node<T> currNode = node;
        if (currNode == null) {
            this.head = prevNode;
            return;
        }
        nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
        reverse(prevNode, currNode, nextNode);
    }

    public T getMiddleNode(Node<T> node) {
        Node<T> head = node;
        Node<T> fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void rotateClockwise(int noOfTimes) {
        Node<T> current = head;
        int size = size() - 1;
        noOfTimes = noOfTimes % size;
        Node<T> lastNode = getNode(size);

        for (int i = 0; i < noOfTimes - 1; i++) {
            current = current.next;
        }
        Node<T> newHead = current.next;
        current.next = null;
        lastNode.next = head;
        head = newHead;
    }

    public void removeGivenNodeWithoutHeadPtr(Node nodeToDelete) {  // 1 2 3 4 5 , toDelete= 2
        if (nodeToDelete == null || nodeToDelete.next == null)
            return;

        Node nextNode = nodeToDelete.next; // 3
        nodeToDelete.data = nextNode.data;
        nodeToDelete.next = nextNode.next;
        nextNode.next = null;
    }


    public int size() {
        int size = 0;
        Node<T> start = this.head;
        while (start != null) {
            start = start.next;
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        final StringJoiner stringJoiner = new StringJoiner("->");
        Node<T> node = this.head;
        while (node != null) {
            if (node.data == null) {
                stringJoiner.add("null");
            } else {
                stringJoiner.add(node.data.toString());
            }
            node = node.next;
        }
        return stringJoiner.toString();
    }
}