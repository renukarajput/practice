package edu.ren.design.queue;

class MyCircularQueue {
//can also use singly linked list to implement the same
    private final int[] queue;
    private int headIndex;
    private int count;
    private final int capacity;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }

    /** Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (this.count == this.capacity)
            return false;
        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        count++;
        return true;
    }

    /** Return true if the operation is successful. */
    public boolean deQueue() {
        if (this.count == 0)
            return false;
        this.headIndex = (this.headIndex + 1) % this.capacity;
        count--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (this.count == 0)
            return -1;
        return this.queue[this.headIndex];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (this.count == 0)
            return -1;
        int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
        return this.queue[tailIndex];
    }

    public boolean isEmpty() {
        return (this.count == 0);
    }

    public boolean isFull() {
        return (this.count == this.capacity);
    }

    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.enQueue(3);
        boolean param_4 = obj.enQueue(4);
        int param_5 = obj.Rear();
        boolean param_6 = obj.isFull();
        boolean param_7 = obj.deQueue();
        boolean param_8 = obj.enQueue(4);
        int param_9 = obj.Front();
        boolean param_10 = obj.isEmpty();
        int param_11 = obj.Rear();
    }
}