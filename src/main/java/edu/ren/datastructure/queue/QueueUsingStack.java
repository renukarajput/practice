package edu.ren.datastructure.queue;

import java.util.Stack;

public class QueueUsingStack { // FIFO
    Stack<Integer> stackNewElmOnTop = new Stack<>();
    Stack<Integer> stackOldElmOnTop = new Stack<>();

    void add(Integer elm){
        stackNewElmOnTop.push(elm); // 1 2 3
    }

    Integer peek() {
        shiftStacks();
        return stackOldElmOnTop.peek();
    }

    Integer remove(){
        shiftStacks();
        return stackOldElmOnTop.pop(); // 1
    }

    private void shiftStacks() {
        if(stackOldElmOnTop.isEmpty()) {
            while(!stackNewElmOnTop.isEmpty()){
                stackOldElmOnTop.push(stackNewElmOnTop.pop()); // 3 2 1
            }
        }
    }

    @Override
    public String toString() {
        return "QueueUsingStack{" +
                "stackNewElmOnTop=" + stackNewElmOnTop +
                ", stackOldElmOnTop=" + stackOldElmOnTop +
                '}';
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
