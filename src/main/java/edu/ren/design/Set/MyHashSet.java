package edu.ren.design.Set;

class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashSet<K, V> {
    Node<K, V>[] table;
    int capacity = 16;
    int size;

    public MyHashSet() {
        table = (Node<K, V>[]) new Object[capacity];
    }

    public void add(K key) {
        final int hashCode = key.hashCode();
        final int index = hashCode % table.length - 1;
        if (table[index] == null) {
            table[index] = new Node<>(key, null);
        } else {
            Node<K, V> head = table[index];
            while (head.next != null) {
                if (head.key == key) {
                    return;
                }
                head = head.next;
            }
            head.next = new Node<>(key, null);
        }
        size++;
    }

    //n1 n2 n3 n4
    public void remove(K key) {
        final int hashCode = key.hashCode();
        final int index = hashCode % table.length - 1;
        Node<K, V> head = table[index];
        Node<K, V> prev = null;
        Node<K, V> current = head;
        while (current.next != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                    return;
                }
                prev.next=current;
            }
            prev=current;
            current=current.next;
            size--;
        }
    }

    public boolean contains(K key) {
        final int hashCode = key.hashCode();
        final int index = hashCode % table.length - 1;
        Node<K, V> head = table[index];
        while (head.next != null) {
            if (head.key == key) {
                return true;
            }
        }
        return false;
    }

}