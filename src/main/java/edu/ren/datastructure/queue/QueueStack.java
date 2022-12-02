package edu.ren.datastructure.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by rakesh on 17/09/17.
 */
public class QueueStack<T> {
    private Queue<T> queueOne;
    private Queue<T> queueTwo;

    private boolean isFirstQueueActive;
    private final T MARKER = (T)new Object();
    public QueueStack() {
        this.queueOne = new LinkedList<>();
        this.queueTwo=new LinkedList<>();
    }

  /*
  The first queue is active queue ,all elements in active queue are recent than all elements in passive queue
  during pop ,delete elements from active queue and insert in passive queue ,swap active and passive

    // q1 1-2-3-4
    //q2
//pop --returns 4
    // q1 4
    //q2 1-2-3
    // q1
    //q2 1-2-3
//push 5,6,7
    // q1 5-6-7
    //q2 1-2-3

    //pop
    //7
    //q2 1-2-3-5-6

    //q1 1-2-3-5
    //q2  6
    //swap q1 5-6
    //     q2 1-2-3


    */

    //4-3-2-#-5-6
    public T pop() {
        if (getActiveQueue().isEmpty()) {
            toggleActiveQueue();
        }
        Queue<T> activeQueue = getActiveQueue();
        Queue<T> passiveQueue = getPassiveQueue();
        T result=null;
        while (!activeQueue.isEmpty()) {
            T element = activeQueue.remove();
            if (activeQueue.isEmpty()) {
                result= element;
                break;
            }
            passiveQueue.add(element);
        }
        if(result==null){
            throw new NoSuchElementException("stack is empty");
        }
        toggleActiveQueue();
        return result;

    }


    public void push(T element){
        getActiveQueue().add(element);
    }

    private Queue<T> getActiveQueue(){
        if(isFirstQueueActive) {
            return queueOne;
        }
        else {
            return queueTwo;
        }
    }

    private Queue<T> getPassiveQueue(){
        if(getActiveQueue()==queueOne){
            return queueTwo;
        }
        return queueOne;
    }
    private void toggleActiveQueue(){
        isFirstQueueActive=!isFirstQueueActive;
    }
}
