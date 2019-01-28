package edu.ren.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBackedStack<T> {

    Queue<T> queueOne = new LinkedList<>();
    Queue<T> queueTwo = new LinkedList<>();
    private boolean isFirstActive = true;

    public void push(T item) {
        Queue<T> activeQueue = getActiveQueue();
        activeQueue.add(item);
    }

    public T pop() {
        Queue<T> activeQueue = getActiveQueue();
        while (true) {
            T head = activeQueue.remove();
            if (activeQueue.isEmpty()) {
                isFirstActive = !isFirstActive;
                return head;
            }
            getTempQueue().add(head);
        }
    }

    private Queue<T> getActiveQueue() {
        return isFirstActive ? queueOne : queueTwo;
    }

    private Queue<T> getTempQueue() {
        return getActiveQueue() == queueOne ? queueTwo : queueOne;
    }
}
